package cn.est.service;

import cn.est.base.BaseException;
import cn.est.dto.EvaluteDTO;
import cn.est.dto.MalfunctionDTO;

import java.util.HashMap;
import java.util.List;

/**
 * @author ZH
 * @data 2021/7/29 
 */
public interface MalfunctionService {

    /**
     * 查询估价金额
     * @param modelId 商品型号id
     * @param optionIds 选项ids（逗号拼接的评估信息选项ids）
     * @param token /
     * @return 估价信息
     * @throws BaseException
     */
    EvaluteDTO assess(Long modelId, String optionIds, String token) throws BaseException;

    /**
     * 查询评估维度信息
     * @param modelId 商品型号id
     * @return 评估维度信息列表
     * @throws BaseException /
     */
    List<MalfunctionDTO> specList(Long modelId) throws BaseException;

}
