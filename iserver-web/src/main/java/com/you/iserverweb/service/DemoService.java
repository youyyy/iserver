package com.you.iserverweb.service;

import com.you.iserverapi.ResponseResult;
import com.you.iserverapi.dto.req.UserReqDTO;

/**
 * @program: iserver
 * @description: description
 * @author: youyi
 * @create: 2019-12-26 14:47
 **/
public interface DemoService {
    ResponseResult fun1();

    ResponseResult getUser();

    ResponseResult addUser(UserReqDTO reqDTO);

}
