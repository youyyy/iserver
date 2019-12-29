package com.you.iserverservice.rpc;

import com.alibaba.dubbo.config.annotation.Service;
import com.you.iserverapi.ResponseResult;
import com.you.iserverapi.enums.ResultCodeMsgEnum;
import com.you.iserverapi.rpc.DemoRpcService;
import com.you.iserverapi.rpc.UserRpcService;
import com.you.iserverservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @program: iserver
 * @description: description
 * @author: youyi
 * @create: 2019-12-26 15:00
 **/
@Service(version = "1.0")
public class DemoRpcServiceImpl implements DemoRpcService {
    @Autowired
    private UserService userService;
    @Override
    public ResponseResult fun1() {
        return ResponseResult.error(ResultCodeMsgEnum.SYS_ERR.getEnumValue(),"xiaoyou");
    }

    @Override
    public ResponseResult getUser() {
        return ResponseResult.success(userService.getList());
    }
}
