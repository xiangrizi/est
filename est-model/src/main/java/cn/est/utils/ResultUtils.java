package cn.est.utils;

import cn.est.constants.ResultEnum;
import cn.est.dto.Result;

/**
 * 用于返回Result的工具类
 *
 * @author Charles
 * @date 2021/7/12 13:43
 */
public class ResultUtils {

    /**
     * 统一返回成功的Result
     *
     * @return /
     */
    public static Result success() {
        Result result = new Result(ResultEnum.SUCCESS);
        return result;
    }

    /**
     * 统一返回成功的Result 带状态信息 不带数据
     *
     * @param msg 状态信息
     * @return /
     */
    public static Result success(String msg) {
        Result result = new Result(ResultEnum.SUCCESS.getCode(), msg);
        return result;
    }

    /**
     * 统一返回成功的Result 带数据 不带状态信息
     *
     * @param data 数据
     * @return /
     */
    public static <T> Result<T> successData(T data) {
        Result<T> result = new Result<>(ResultEnum.SUCCESS);
        result.setData(data);
        return result;
    }

    /**
     * 统一返回成功的Result 带状态信息 带数据
     *
     * @param msg  状态信息
     * @param data 数据
     * @return /
     */
    public static <T> Result<T> success(String msg, T data) {
        Result<T> result = new Result<>(ResultEnum.SUCCESS.getCode(), msg, data);
        return result;
    }

    /**
     * 统一返回成功的Result 根据枚举构造的Result
     *
     * @param resultEnum /
     * @return /
     */
    public static Result success(ResultEnum resultEnum) {
        Result result = new Result(resultEnum);
        return result;
    }

    /**
     * 统一返回失败的Result
     *
     * @return /
     */
    public static Result fail() {
        Result result = new Result(ResultEnum.FAIL);
        return result;
    }

    /**
     * 统一返回失败的Result，code统一为 “1”，msg自定义
     *
     * @param msg 状态信息
     * @return /
     */
    public static Result fail(String msg) {
        Result result = new Result(ResultEnum.FAIL.getCode(), msg);
        return result;
    }

    /**
     * 统一返回失败的Result 带状态码 带状态信息
     *
     * @param code 状态码
     * @param msg  状态信息
     * @return /
     */
    public static Result fail(String code, String msg) {
        Result result = new Result(code, msg);
        return result;
    }

    /**
     * 统一返回失败的Result 根据枚举构造的Result
     *
     * @param resultEnum /
     * @return /
     */
    public static Result fail(ResultEnum resultEnum) {
        Result result = new Result(resultEnum);
        return result;
    }

}
