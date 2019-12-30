package com.you.iserverservice.rpc;

import com.alibaba.dubbo.config.annotation.Service;
import com.you.iserverapi.ResponseResult;
import com.you.iserverapi.dto.req.UserReqDTO;
import com.you.iserverapi.dto.res.UserResDTO;
import com.you.iserverapi.enums.ResultCodeMsgEnum;
import com.you.iserverapi.rpc.DemoRpcService;
import com.you.iserverservice.entity.User;
import com.you.iserverservice.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: iserver
 * @description: description
 * @author: youyi
 * @create: 2019-12-26 15:00
 **/
@Service(version = "1.0")
@Slf4j
public class DemoRpcServiceImpl implements DemoRpcService {
    @Autowired
    private UserService userService;
    @Override
    public ResponseResult fun1() {
        return ResponseResult.error(ResultCodeMsgEnum.SYS_ERR.getEnumValue(),"xiaoyou");
    }

    @Override
    public ResponseResult getUser() {
        List<User> users = userService.getList();
        List<UserResDTO> resDTOS = new ArrayList<>();

        users.forEach(e->{
            UserResDTO resDTO = new UserResDTO();
            BeanUtils.copyProperties(e,resDTO);
            resDTOS.add(resDTO);
        });
        log.info("呵呵");
        return ResponseResult.success(resDTOS);
    }

    @Override
    public ResponseResult adduser(UserReqDTO userReqDTO) {
        User user = new User();
        BeanUtils.copyProperties(userReqDTO,user);
        Integer num = userService.addUser(user);
        return num>0 ? ResponseResult.success() : ResponseResult.sysError();
    }


}
