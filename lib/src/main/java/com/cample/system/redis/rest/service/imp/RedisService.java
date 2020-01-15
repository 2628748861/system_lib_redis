package com.cample.system.redis.rest.service.imp;

import com.cample.system.redis.rest.service.IRedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class RedisService implements IRedisService {

    @Autowired
    RedisTemplate redisTemplate;

    @Override
    public Set<String> findKey(String key) {
        if(!"*".equals(key)){
            key="*"+key+"*";
        }
        return redisTemplate.keys(key);
    }

    @Override
    public Set<String> findKey(String key, int pageNumber, int pageSize) {



        return null;
    }

    @Override
    public void delete(String key) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public String getValue(String key) {
        return null;
    }
}
