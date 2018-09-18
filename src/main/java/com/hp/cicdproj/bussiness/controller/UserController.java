package com.hp.cicdproj.bussiness.controller;

import com.hp.cicdproj.bussiness.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="/api/userController")
public class UserController {

    @RequestMapping(value="/getUser/{userId}",method=RequestMethod.GET)
    @ResponseBody
    public User getUser(@PathVariable String userId) {
        User user = null;
        if("1".equals(userId))
            user = new User();
        return user;
    }
}
