package com.example.github.Utils;

public enum Enumeration {
    OPERATION_SUCCESS(0, "操作成功"),
    ADD_DATA_ERROR(1, "新增失败"),
    QUERY_DATA_ERROR(2, "查询失败");



    private String msg ;
    private int code ;





    Enumeration(int statusCode, String statusMsg) {
        this.code = statusCode;
        this.msg = statusMsg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
