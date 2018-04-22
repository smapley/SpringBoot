package com.smapley.blog.base.exception;

import com.smapley.blog.base.RestResponse;
import com.smapley.blog.base.RestResponseStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * 统一异常处理
 *
 * 使用@ControllerAdvice定义统一的异常处理类
 * 使用@ExceptionHandler用来定义函数针对的异常类型，
 * 最后将Exception对象和请求URL映射到error.html中
 *
 * @author EricNts
 * @date 2018/4/22
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    private static final String DEFAULT_ERROR_VIEW = "error";


    @ExceptionHandler(value = RestException.class)
    @ResponseBody
    public RestResponse jsonErrorHandler(HttpServletRequest req, RestException e) {
        RestResponse r = new RestResponse<>(RestResponseStatus.FAIL);
        r.setUrl(req.getRequestURL().toString());
        return r;
    }

    @ExceptionHandler(value = Exception.class)
    public ModelAndView defaultErrorHandler(HttpServletRequest req, Exception e) {
        ModelAndView mav = new ModelAndView();
        mav.addObject("exception", e);
        mav.addObject("url", req.getRequestURL());
        mav.setViewName(DEFAULT_ERROR_VIEW);
        return mav;
    }
}
