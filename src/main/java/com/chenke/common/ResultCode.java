package com.chenke.common;

/**
 * @author chenke
 * @version 1.0.0
 * @ClassName ResultCode.java
 * @Description TODO
 * @createTime 2022年05月02日 09:00:00
 */
/**
 * API 统一返回状态码
 */
public enum ResultCode {

    /* 成功状态码 */
    SUCCESS(1, "成功"),
    /* 失败状态码 */
    FAILURE(0, "失败");

    private Integer code;
    private String message;

    ResultCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer code() {
        return this.code;
    }

    public String message() {
        return this.message;
    }

    public static String getMessage(String name) {
        for (ResultCode item : ResultCode.values()) {
            if (item.name().equals(name)) {
                return item.message;
            }
        }
        return name;
    }

    public static Integer getCode(String name) {
        for (ResultCode item : ResultCode.values()) {
            if (item.name().equals(name)) {
                return item.code;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return this.name();
    }

}