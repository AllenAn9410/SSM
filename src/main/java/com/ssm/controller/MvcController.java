package com.ssm.controller;

import com.ssm.entity.UserInfo;
import com.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MvcController {
    @Autowired(required = false)
    public UserService userService;

    @RequestMapping(path = "/seek", method = RequestMethod.GET)
    public String seek(@RequestParam("user") String user, @RequestParam("id") int id) throws Exception {
        UserInfo userInfo = userService.seek(id,user);
        System.out.println(id + " ,  " + user);
        return userService.seek(id,user).toString();
    }


    public static boolean isEmpty(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        return false;
    }
}
