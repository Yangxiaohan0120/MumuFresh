package com.example.springbootmall.exception;

/**
 * 统一异常
 * @author Chris Yang
 * created 2022-08-03 14:14
 **/
public class MallException extends RuntimeException{
    private final Integer code;
    private final String msg;

    public MallException(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public MallException(MallExceptionEnum exceptionEnum) {
        this(exceptionEnum.getCode(),exceptionEnum.getMsg());
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }


}
