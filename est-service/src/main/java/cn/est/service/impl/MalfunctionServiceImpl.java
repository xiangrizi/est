package cn.est.service.impl;

import cn.est.base.BaseException;
import cn.est.constants.Constants;
import cn.est.constants.ResultEnum;
import cn.est.dto.EvaluteDTO;
import cn.est.dto.MalfunctionDTO;
import cn.est.mapper.EvaluateMapper;
import cn.est.mapper.MalfunctionMapper;
import cn.est.mapper.MalfunctionOptionsMapper;
import cn.est.pojo.Evaluate;
import cn.est.pojo.MalfunctionOptions;
import cn.est.service.MalfunctionService;
import cn.est.utils.RedisUtils;
import cn.hutool.core.convert.Convert;
import cn.hutool.core.text.StrSplitter;
import cn.hutool.core.util.StrUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * @author ZH
 * @data 2021/7/29
 */
@Service
@RequiredArgsConstructor
public class MalfunctionServiceImpl implements MalfunctionService {

    private final MalfunctionMapper malfunctionMapper;
    private final MalfunctionOptionsMapper malfunctionOptionsMapper;
    private final EvaluateMapper evaluateMapper;
    private final RedisUtils redisUtils;

    @Override
    public EvaluteDTO assess(Long modelId, String optionIds, String token) throws BaseException {

        // 1.查询用户信息
//        String userKey = redisUtils.getRedisKeyWithColon(Constants.Redis.PREFIX_TOKEN, token);
//        String users = redisUtils.getValue(userKey);
//        if (StrUtil.isEmpty(users)) {
//            throw new BaseException(ResultEnum.FAIL_PARAM.getCode(), "token信息错误！");
//        }

        // 2.根据条件查询估价金额
        HashMap<Object, Object> params = new HashMap<>();
        params.put("modelId", modelId);
        if (optionIds.length() > 1) {
            // 根据,(逗号)进行分割
            List<String> optionIdsList = StrSplitter.split(optionIds, ',', 0, true, true);
            params.put("optionIdsList", optionIdsList);
        }else {
            params.put("optionIds",optionIds);
        }
        List<MalfunctionOptions> malfunctionOptionsList = malfunctionOptionsMapper.getByModeIdAndOptionIds(params);

        // 初始化评估价格
        int price = 0;
        for (MalfunctionOptions malfunctionOptions : malfunctionOptionsList) {
            price += malfunctionOptions.getRatio();
        }

        // 3.插入评估信息
        Evaluate evaluate = new Evaluate();
        evaluate.setModelId(modelId);
        evaluate.setPrice(Convert.toBigDecimal(price));
        evaluate.setSubscription(Convert.toBigDecimal(price * 0.1));
        evaluate.setCreatdTime(new Date());
        evaluate.setIsDelete(0);
        evaluateMapper.insert(evaluate);

        // 封装信息
        EvaluteDTO evaluteDTO = new EvaluteDTO();
        evaluteDTO.setModelId(modelId);
        evaluteDTO.setPrice(evaluate.getPrice());
        evaluteDTO.setSubscription(evaluate.getSubscription());
        evaluteDTO.setId(evaluate.getId());

        return evaluteDTO;
    }

    @Override
    public List<MalfunctionDTO> specList(Long modelId) throws BaseException {

        // 1.查询缓存
        String specListKey = redisUtils.getRedisKeyWithColon(Constants.Redis.KEY_Malfunction, modelId.toString());
        String specListValue = redisUtils.getValue(specListKey);
        if (!StrUtil.isAllEmpty(specListValue)) {
            return JSONObject.parseArray(specListValue, MalfunctionDTO.class);
        }

        // 2.查询数据库
        List<MalfunctionDTO> malfunctionDTOList = malfunctionMapper.getByModelId(modelId);
        if (malfunctionDTOList == null) {
            throw new BaseException(ResultEnum.FAIL_PARAM.getCode(), "商品型号id有误！");
        }
        redisUtils.putValue(specListKey, JSON.toJSONString(malfunctionDTOList), Constants.Duration.DAY * 2);

        return malfunctionDTOList;
    }
}
