package com.you.iserverweb.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.you.iserverapi.ResponseResult;
import com.you.iserverapi.rpc.DemoRpcService;
import com.you.iserverweb.service.DemoService;
import org.springframework.stereotype.Service;

/**
 * @program: iserver
 * @description: description
 * @author: youyi
 * @create: 2019-12-26 14:40
 **/
@Service
public class DemoServiceImpl implements DemoService {

    @Reference(version = "1.0")
    private DemoRpcService demoRpcService;

    @Override
    public ResponseResult fun1() {
        return demoRpcService.fun1();
    }
}
