package com.you.iserverapi.exception;


import com.you.iserverapi.ResponseResult;

public class IParamException extends IException {
    public IParamException(String message) {
        super(ResponseResult.Constants.PARAM_ERROR, message);
    }

    public IParamException(String message, Throwable cause) {
        super(ResponseResult.Constants.PARAM_ERROR, message, cause);
    }
}
