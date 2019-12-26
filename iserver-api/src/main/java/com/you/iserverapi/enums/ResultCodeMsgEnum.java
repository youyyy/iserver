package com.you.iserverapi.enums;


public enum ResultCodeMsgEnum {
    SUCCESS(1, "成功"),
    SYS_ERR(0, "服务器错误，请联系管理员！"),
    PARAM_ERR(10, "参数不能为空"),
    OPTIMISTIC_ERR(16, "数据版本错误，请刷新页面后操作"),
    UPDATE_ERR(20, "更新失败"),
    NO_DATA_ERR(25, "未查到数据")

    ;
    private int enumValue;
    private String enumName;

    private ResultCodeMsgEnum(int enumValue, String enumName) {
        this.enumValue = enumValue;
        this.enumName = enumName;
    }

    public int getEnumValue() {
        return enumValue;
    }

    public String getEnumName() {
        return enumName;
    }
}
