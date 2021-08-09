package com.aop.springbootaop.caching;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class CacheService {
    @Cacheable(cacheNames = "ourCache")
    public String longRun() throws InterruptedException {
        Thread.sleep(5000L);
        return "Cache işlemi başlatıldı.";
    }

    @CacheEvict(cacheNames = "ourCache")
    public String clear(){
        return "cache Basariyla Temizlendi";
    }
}
