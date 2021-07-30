package cn.est.dto;

import cn.est.pojo.MalfunctionOptions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author ZH
 * @data 2021/7/29
 */
@ApiModel("一级故障信息DTO")
@Getter
@Setter
public class MalfunctionDTO {

    @ApiModelProperty("问题id")
    private Long id;

    @ApiModelProperty("问题标题")
    private String title;

    @ApiModelProperty("是否有提示信息（0:否,1:是）")
    private Integer isHint;

    @ApiModelProperty("提示信息标题")
    private String hintTitle;

    @ApiModelProperty("提示信息（文字）")
    private String hintInfo;

    @ApiModelProperty("提示信息（图片）")
    private String hintImg;

    @ApiModelProperty("手机二级故障信息")
    private List<MalfunctionOptionsDTO> optionsList;

}
