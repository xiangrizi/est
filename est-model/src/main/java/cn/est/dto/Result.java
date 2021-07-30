package cn.est.dto;

import cn.est.constants.ResultEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * 返回信息包装类
 *
 * @param <T> /
 */
@ApiModel("返回信息包装类")
@Getter
@Setter
@NoArgsConstructor
public class Result<T> implements Serializable {

    @ApiModelProperty("状态码")
    public String code;

    @ApiModelProperty("状态信息")
    public String msg;

    @ApiModelProperty("响应数据")
    private T data;

    /**
     * 根据code，msg创建一个Resutl
     *
     * @param code /
     * @param msg  /
     */
    public Result(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    /**
     * 根据code，msg，data创建一个Resutl
     *
     * @param code /
     * @param msg  /
     * @param data /
     */
    public Result(String code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    /**
     * 根据枚举创建一个Result
     *
     * @param resultEnum /
     */
    public Result(ResultEnum resultEnum) {
        this.code = resultEnum.getCode();
        this.msg = resultEnum.getMsg();
    }

}
