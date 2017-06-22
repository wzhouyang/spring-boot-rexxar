package com.wzy.springboot.rexxar.demo2;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * demo1 application
 *
 * Created by wzy on 2017/6/22.
 */
@SpringBootApplication
public class Demo2Application {

    public static void main(String[] args) {
        //new SpringApplicationBuilder(Demo2Application.class).bannerMode(Banner.Mode.OFF).web(true).run(args);
        SpringApplication.run(Demo2Application.class, args);
    }
}
