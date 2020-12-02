package com.abc.common;

public enum ResEnum {
    SUCCESS(200,"success"),
    SUCCESS_USER_EXIST(201,"user exist success"),
    ERROR_USER_EXIST(501,"user exist error"),
    ERROR(500,"error");
    private int status;
    private String msg;

    ResEnum(int status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public int getStatus() {
        return status;
    }

    public String getMsg() {
        return msg;
    }

}
