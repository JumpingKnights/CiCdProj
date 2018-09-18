package com.hp.cicdproj.bussiness.controller;

import com.hp.cicdproj.bussiness.pojo.Role;
import com.hp.cicdproj.bussiness.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="/api/roleController")
public class RoleController {

    @RequestMapping(value="/getRole/{roleId}",method=RequestMethod.GET)
    @ResponseBody
    public Role getRole(@PathVariable String roleId) {
        return null;
    }

}
