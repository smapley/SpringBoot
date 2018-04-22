package com.smapley.blog.base;

import lombok.Getter;

/**
 * @author EricNts
 * @date 2018/4/22
 */
@Getter
public enum RestResponseStatus {
    SUCCESS(200,"成功"),
    FAIL(400,"失败");

    private Integer code;
    private String message;
    RestResponseStatus(Integer code, String message){
        this.code = code;
        this.message = message;
    }


}
