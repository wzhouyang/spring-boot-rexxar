package com.wzy.springboot.rexxar.redis1;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.script.RedisScript;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Collections;

/**
 * Created by wzy on 2017/6/28.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Redis1Application.class)
public class Test {

    @Autowired
    private RedisScript redisScript;

    @Autowired
    private RedisTemplate redisTemplate;

    @org.junit.Test
    public void name() throws Exception {
        System.out.println(redisScript.getSha1());
        Long test1 = (Long) redisTemplate.execute(redisScript, Collections.singletonList("test"), 1, 50);
        System.out.println(test1);
    }
}
