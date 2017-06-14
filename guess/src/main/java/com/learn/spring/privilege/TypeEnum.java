package com.learn.spring.privilege;

/**
 * @author zhangfb
 */
public enum TypeEnum {

    NO(-1, "无"),
    HALF_PRICE(1, "半价"),
    EIGHT_ZHE(2, "8折");

    private int code;
    private String name;

    TypeEnum(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}
