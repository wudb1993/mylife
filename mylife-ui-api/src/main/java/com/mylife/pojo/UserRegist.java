package com.mylife.pojo;

import java.util.Date;

/**
 * 用户基础注册信息
 * @author 矜持的折返跑
 * @date 2017-12-06
 */
    public class UserRegist {
    private long id;
    private String userName;
    private String loginPwd;
    private Date birthDay;
    private Date investDate;
    private String role;
    private String sex;
    private String idCard;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
