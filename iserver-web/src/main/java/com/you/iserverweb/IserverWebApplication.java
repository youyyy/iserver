package com.you.iserverweb;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication(scanBasePackages="com.you")
@EnableDubbo
@SpringBootApplication
public class IserverWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(IserverWebApplication.class, args);
    }

}
