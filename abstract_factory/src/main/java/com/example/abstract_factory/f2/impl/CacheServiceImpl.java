package com.example.abstract_factory.f2.impl;

import com.example.abstract_factory.RedisUtils;
import com.example.abstract_factory.f2.CacheService;

import java.util.concurrent.TimeUnit;

public class CacheServiceImpl implements CacheService {
    private RedisUtils redisUtils = new RedisUtils();

    public String get(String key) {
        return redisUtils.get(key);
    }

    public void set(String key, String value) {
        redisUtils.set(key, value);
    }

    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        redisUtils.set(key, value, timeout, timeUnit);
    }

    public void del(String key) {
        redisUtils.del(key);
    }
}
