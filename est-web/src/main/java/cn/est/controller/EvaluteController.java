package cn.est.controller;


import cn.est.base.BaseException;
import cn.est.dto.EvaluteDTO;
import cn.est.dto.MalfunctionDTO;
import cn.est.dto.Result;
import cn.est.service.MalfunctionService;
import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static cn.est.utils.ResultUtils.*;

/**
 * @author ZH
 * @data 2021/7/29
 */
@Api(tags = "评估控制器")
@RestController
@RequestMapping("/api/evaluate")
@RequiredArgsConstructor
public class EvaluteController {

    private final MalfunctionService malfunctionService;

    /**
     * 估价
     * @param modelId 商品型号id
     * @param optionIds 选项ids（逗号拼接的评估信息选项ids）
     * @param token /
     * @return 估价信息
     * @throws BaseException
     */
    @ApiOperationSupport(author = "(⊙ˍ⊙)")
    @ApiOperation(value = "估价", notes = "根据用户选择的故障信息，对商品维修进行评估。")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "modelId",value = "商品型号id",required = true),
            @ApiImplicitParam(name = "optionIds",value = "选项ids（逗号拼接的评估信息选项ids）",required = true),
            @ApiImplicitParam(name = "token",value = "用户token",required = true)
    })
    @PostMapping("/assess")
    public Result<EvaluteDTO> assess(@RequestParam Long modelId, @RequestParam String optionIds,
                                     @RequestHeader String token ) throws BaseException {
        return successData(malfunctionService.assess(modelId, optionIds, token));
    }

    /**
     * 评估维度信息
     * @param modelId 商品型号id
     * @return 评估维度信息列表
     * @throws BaseException/
     */
    @ApiOperationSupport(author = "(⊙ˍ⊙)")
    @ApiOperation(value = "评估维度", notes = "根据商品分类查询评估维度信息。")
    @ApiImplicitParam(name = "modelId",value = "商品型号id",required = true)
    @GetMapping("/specList")
    public Result<List<MalfunctionDTO>> specList(@RequestParam Long modelId) throws BaseException {
        return successData(malfunctionService.specList(modelId));
    }

}

