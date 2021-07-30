package cn.est.base;

import cn.est.constants.ResultEnum;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 自定义的全局异常
 */
@Getter
@Setter
@NoArgsConstructor
public class BaseException extends Exception {

    private static final long serialVersionUID = 1L;

    /**
     * 一个返回状态枚举的构造函数
     *
     * @param resultEnum /
     */
    public BaseException(ResultEnum resultEnum) {
        this(resultEnum.getCode(), resultEnum.getMsg());
        this.resultEnum = resultEnum;
    }

    public BaseException(String errorCode, String errorMsg) {
        super(errorMsg);
        this.errorCode = errorCode;
        this.errorMessage = errorMsg;
    }

    // 返回信息枚举
    private ResultEnum resultEnum;
    // 错误码
    private String errorCode;
    // 错误信息
    private String errorMessage;

}
