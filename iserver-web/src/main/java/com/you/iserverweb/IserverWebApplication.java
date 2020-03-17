package com.you.iserverweb;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

//@SpringBootApplication(scanBasePackages="com.you")
@EnableDubbo
@ServletComponentScan
@SpringBootApplication
public class IserverWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(IserverWebApplication.class, args);
    }

}
