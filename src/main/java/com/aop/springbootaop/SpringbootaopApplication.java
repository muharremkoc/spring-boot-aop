package com.aop.springbootaop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
@EnableCaching
public class SpringbootaopApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootaopApplication.class, args);
    }

}
