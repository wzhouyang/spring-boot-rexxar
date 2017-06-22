package com.wzy.springboot.rexxar.demo1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wzy on 2017/6/22.
 */
@RestController
public class HelloController {

    @RequestMapping("/helloWorld")
    public String helloWorld(String name) {
        return name == null ? "hello world" : "hello world " + name;
    }
}
