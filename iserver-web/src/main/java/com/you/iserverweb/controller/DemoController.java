package com.you.iserverweb.controller;

import com.you.iserverapi.ResponseResult;
import com.you.iserverweb.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: iserver
 * @description: description
 * @author: youyi
 * @create: 2019-12-26 15:14
 **/
@RestController
public class DemoController {
    @Autowired
    private DemoService demoService;
    @GetMapping("/demo")
    public ResponseResult fun1(){
        return demoService.fun1();
    }
}
