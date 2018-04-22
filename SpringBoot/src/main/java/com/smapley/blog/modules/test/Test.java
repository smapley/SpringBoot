package com.smapley.blog.modules.test;


import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author EricNts
 * @date 2018/4/22
 */
@Getter
@Setter
public class Test {
    private String name;
    private Integer age;

    public Test(){

    }

    public Test(String name, Integer age){
        this.name = name;
        this.age = age;
    }
}
