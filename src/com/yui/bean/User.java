package com.yui.bean;

/**
 * @Author: Administrator
 * @Date: 2021/8/11
 * @Description:
 * @Modified By:
 */
public class User {
    String username;
    String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
