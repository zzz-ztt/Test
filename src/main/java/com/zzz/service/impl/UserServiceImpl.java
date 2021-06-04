package com.zzz.service.impl;

import com.zzz.dao.UserDao;
import com.zzz.pojo.User;
import com.zzz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public int addUser(String name, String password, String phone) {
        return userDao.addUser(name,password,phone);
    }

    @Override
    public String  selectUser(String name) {
        return userDao.selectUser(name);
    }

    @Override
    public User getAllUser(String username) {
        return userDao.getAllUser(username);
    }

    @Override
    public int addUserByUser(String username, String name, String phone, String cardId, Integer sex, String address, String aa) {
        return userDao.addUserByUser(username,name,phone,cardId,sex,address,aa);
    }


}
