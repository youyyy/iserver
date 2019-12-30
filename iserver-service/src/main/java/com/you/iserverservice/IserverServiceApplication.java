package com.you.iserverservice;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.you.iserverapi.rpc.DemoRpcService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@EnableDubbo
@SpringBootApplication(scanBasePackages="com.you")
@ImportResource(locations = "classpath:spring/spring-main.xml")
@MapperScan("com.you.iserverservice.dao")
public class IserverServiceApplication {

    public static void main(String[] args) {
       SpringApplication.run(IserverServiceApplication.class, args);
    }

}
