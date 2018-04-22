package com.smapley.blog.modules;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author EricNts
 * @date 2018/4/22
 */
@Controller
public class HelloController {

    @RequestMapping(value = {"home",""})
    public String home(){
        return "home";
    }
    @RequestMapping(value = {"hello"})
    public String hello(){
        return "hello";
    }
    @RequestMapping(value = {"login"})
    public String login(){
        return "login";
    }
//
//    @Override
//    public void addViewControllers(ViewControllerRegistry registry) {
//        registry.addViewController("/home").setViewName("home");
//        registry.addViewController("/").setViewName("home");
//        registry.addViewController("/hello").setViewName("hello");
//        registry.addViewController("/login").setViewName("login");
//    }

}