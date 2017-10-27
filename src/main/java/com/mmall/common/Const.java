package com.mmall.common;

/**
 * Created by lihaochun on 2017/10/17.
 */
public class Const {
    public static final String EMAIL="email";
    public static final String USERNAME="username";
    public static String CURRENT_USER = "currentUser";
    public interface Role{
        int ROLE_CUSTOMER=0; //普通用户
        int ROLE_ADMIN=1;  //管理员
    }
}
