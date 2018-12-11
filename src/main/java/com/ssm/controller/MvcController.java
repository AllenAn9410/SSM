package com.ssm.controller;

import com.ssm.entity.UserInfo;
import com.ssm.service.UserService;
import com.ssm.validate.ParamValidate;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class MvcController {
    @Autowired(required = false)
    public UserService userService;

    @InitBinder
    public void initBinder(WebDataBinder webDataBinder){
        webDataBinder.addValidators(new ParamValidate());
    }

    @RequestMapping(path = "/seek", method = RequestMethod.GET)
    public String seek(@RequestParam("user") String user, @RequestParam("id") int id) throws Exception {
        UserInfo userInfo = userService.seek(id,user);
        System.out.println(id + " ,  " + user);
        return userService.seek(id,user).toString();
    }


    @RequestMapping(path="aa/{bb}",method = RequestMethod.POST)
    public Map test(@PathVariable("bb") String bb){
//        JSONObject jsonObject = new JSONObject();
//        jsonObject.put("url",bb);
        Map<String ,String> rtn=new HashMap<>();
        rtn.put("url",bb);
        return  rtn;
    }

    @RequestMapping(path="json",method = RequestMethod.POST)
    public String json(Map str){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("url",str.toString());
        System.out.println(str.toString());
        return jsonObject.toString();
    }

    public static boolean isEmpty(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        return false;
    }
}
