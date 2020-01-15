package com.test;

import com.cample.system.redis.rest.service.IRedisService;
import com.cample.system.redis.rest.service.imp.RedisService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        IRedisService redisService=new RedisService();
        redisService.findKey("a");
    }

}
