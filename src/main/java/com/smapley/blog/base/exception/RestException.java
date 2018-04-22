package com.smapley.blog.base.exception;

/**
 * 接口异常
 *
 * @author EricNts
 * @date 2018/4/22
 */
public class RestException extends Exception {

    public RestException(String message){
        super(message);
    }
}
