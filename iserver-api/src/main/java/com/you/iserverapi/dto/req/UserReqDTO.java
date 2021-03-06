package com.you.iserverapi.dto.req;

import java.io.Serializable;

/**
 * @program: iserver
 * @description: description
 * @author: youyi
 * @create: 2019-12-26 10:08
 **/
public class UserReqDTO implements Serializable {
    private Long id;

    private String account;

    private String name;

    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

}
