package cn.est.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author ZH
 * @data 2021/7/29
 */
@ApiModel("二级故障信息DTO")
@Getter
@Setter
public class MalfunctionOptionsDTO {

    @ApiModelProperty("选项id")
    private Long id;

    @ApiModelProperty("选项名称")
    private String optionName;

    @ApiModelProperty("是否有提示信息（0:否,1:是）")
    private Integer isHint;

    @ApiModelProperty("提示信息（文字）")
    private String hintInfo;

    @ApiModelProperty("提示信息（图片）")
    private String hintImg;
}
