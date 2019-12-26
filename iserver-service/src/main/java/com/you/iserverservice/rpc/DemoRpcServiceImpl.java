package com.you.iserverservice.rpc;

import com.alibaba.dubbo.config.annotation.Service;
import com.you.iserverapi.ResponseResult;
import com.you.iserverapi.enums.ResultCodeMsgEnum;
import com.you.iserverapi.rpc.DemoRpcService;

/**
 * @program: iserver
 * @description: description
 * @author: youyi
 * @create: 2019-12-26 15:00
 **/
@Service(version = "1.0")
public class DemoRpcServiceImpl implements DemoRpcService {
    @Override
    public ResponseResult fun1() {
        return ResponseResult.error(ResultCodeMsgEnum.SYS_ERR.getEnumValue(),"xiaoyou");
    }
}
