package com.you.iserverapi.exception;


import com.you.iserverapi.enums.ResultCodeMsgEnum;

public class IException extends RuntimeException {

    private Integer code;
    public IException(Integer code, String message) {
        super(message);
        this.code = code;
    }
    public IException(ResultCodeMsgEnum enumValue) {
        super(enumValue.getEnumName());
        this.code = enumValue.getEnumValue();
    }

    public IException(Integer code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }

    @Override
    public synchronized Throwable fillInStackTrace() {
        return this;
    }

    public Integer getCode() {
        return code;
    }
}
