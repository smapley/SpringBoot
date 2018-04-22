package com.smapley.blog.base;

import lombok.Getter;
import lombok.Setter;

/**
 * 接口返回
 *
 * @author EricNts
 * @date 2018/4/22
 */
@Getter
@Setter
public class RestResponse<T> {
    public RestResponse(RestResponseStatus status){
        this.code = status.getCode();
        this.message = status.getMessage();
    }
    private Integer code;
    private String message;
    private String url;
    private T data;
}
