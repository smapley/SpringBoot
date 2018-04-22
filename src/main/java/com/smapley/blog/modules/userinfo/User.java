package com.smapley.blog.modules.userinfo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author EricNts
 * @date 2018/4/22
 */
@Entity
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Integer age;

    public User(){

    }

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}