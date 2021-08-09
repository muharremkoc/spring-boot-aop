package com.aop.springbootaop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class SpringbootaopApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootaopApplication.class, args);
    }

}
