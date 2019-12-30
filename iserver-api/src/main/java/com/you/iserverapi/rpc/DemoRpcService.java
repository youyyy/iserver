package com.you.iserverapi.rpc;

import com.you.iserverapi.ResponseResult;
import com.you.iserverapi.dto.req.UserReqDTO;

/**
 * @program: iserver
 * @description: description
 * @author: youyi
 * @create: 2019-12-26 14:41
 **/
public interface DemoRpcService {
    ResponseResult fun1();
    ResponseResult getUser();
    ResponseResult adduser(UserReqDTO userReqDTO);

}
