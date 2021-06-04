package com.zzz.service;

import com.zzz.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserService {

    //注册用户
    int addUser(String name,String password,String phone);

    //根据用户名查找
    String selectUser(@Param("name")String name);

    //查找用户信息
    User getAllUser(@Param("username")String username);

    //根据用户名更新用户信息
    int addUserByUser(@Param("username")String username,@Param("name")String name, @Param("phone")String phone,
                      @Param("cardId")String cardId,@Param("sex")Integer sex,
                      @Param("address")String address,@Param("aa")String aa);

}
