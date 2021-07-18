package com.example.abstract_factory.f1;

import com.example.abstract_factory.f1.impl.CacheServiceImpl;
import org.junit.Test;

public class test_CacheService {
    @Test
    public void test_CacheService() {

        CacheService cacheService = new CacheServiceImpl();

        cacheService.set("user_name_01", "小傅哥", 1);
        String val01 = cacheService.get("user_name_01", 1);
        System.out.println("测试结果：" + val01);

    }
}
