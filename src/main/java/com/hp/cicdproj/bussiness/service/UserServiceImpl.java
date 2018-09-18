package com.hp.cicdproj.bussiness.service;

import com.hp.cicdproj.bussiness.UserService;
import com.hp.cicdproj.bussiness.pojo.User;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Override
    public User getUser(String id) {
        return null;
    }
}
