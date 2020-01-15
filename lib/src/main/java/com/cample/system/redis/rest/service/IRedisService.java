package com.cample.system.redis.rest.service;

import java.util.Set;

public interface IRedisService
{
    Set<String> findKey(String key);

    Set<String> findKey(String key,int pageNumber,int pageSize);

    void delete(String key);

    void deleteAll();

    String getValue(String key);
}
