package cn.est.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * @author ZH
 * @date 2021/7/30
 */
@ApiModel("估价信息DTO")
@Getter
@Setter
public class EvaluteDTO {

    @ApiModelProperty("评估信息id")
    private Long id;

    @ApiModelProperty("商品型号id")
    private Long modelId;

    @ApiModelProperty("评估价")
    private BigDecimal subscription;

    @ApiModelProperty("订金")
    private BigDecimal price;

}
