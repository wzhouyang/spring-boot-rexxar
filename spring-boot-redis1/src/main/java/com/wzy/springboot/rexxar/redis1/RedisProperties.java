package com.wzy.springboot.rexxar.redis1;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.core.io.Resource;

/**
 * Created by wzy on 2017/6/28.
 */
@ConfigurationProperties(prefix = "spring.redis")
public class RedisProperties {

    private Resource test1;

    public Resource getTest1() {
        return test1;
    }

    public void setTest1(Resource test1) {
        this.test1 = test1;
    }
}
