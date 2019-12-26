package com.you.iserverservice;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.you.iserverapi.rpc.DemoRpcService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
@EnableDubbo
@SpringBootApplication(scanBasePackages="com.you")
public class IserverServiceApplication {

    public static void main(String[] args) {
       ApplicationContext context = SpringApplication.run(IserverServiceApplication.class, args);
       System.out.println(context.getBean(DemoRpcService.class));
    }

}
