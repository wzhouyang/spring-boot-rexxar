package com.wzy.springboot.rexxar.redis1;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.connection.ReturnType;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.script.RedisScript;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import redis.clients.util.SafeEncoder;

import java.util.Collections;
import java.util.List;

/**
 * Created by wzy on 2017/6/28.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Redis1Application.class)
public class Test {

    @Autowired
    private RedisScript<String> redisScript;

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @org.junit.Test
    public void test() throws Exception {
        System.out.println(redisScript.getSha1());
        List<String> keys = Collections.singletonList("test123");
        String test123 = redisTemplate.execute(redisScript, new StringRedisSerializer(), new StringRedisSerializer(),
                keys, "1", "20");


        System.out.println(test123);
    }

    @org.junit.Test
    public void test1() throws Exception {
        redisTemplate.execute((RedisCallback<Object>) connection -> {
            Object o = connection.evalSha("91cb7bdd1fafe24eeb2c0b487dcca65fe670c7c2", ReturnType.INTEGER, 1,
                    "test"
                    .getBytes(), "1".getBytes(), "20".getBytes());
            System.out.println(o);
            return o;
        });
    }


}
