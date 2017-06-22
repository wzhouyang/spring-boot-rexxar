package com.wzy.springboot.rexxar.demo1;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * demo1 application
 *
 * Created by wzy on 2017/6/22.
 */
@SpringBootApplication
public class Demo1Application {

    public static void main(String[] args) {
        new SpringApplicationBuilder(Demo1Application.class).bannerMode(Banner.Mode.OFF).web(true).run(args);
    }
}
