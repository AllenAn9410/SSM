package com.ssm.service.Impl;

import com.ssm.entity.UserInfo;
import com.ssm.mapper.UserMapper;
import com.ssm.service.UserService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserServiceImpl userService;

    @Autowired
    UserMapper userMapper;

    @Override
    public UserInfo seek(int userid, String username) throws Exception {
        return userMapper.seek(userid, username);
    }

    @Override
    public UserInfo findByName(String name) throws Exception{
        return userMapper.findByName(name);
    }

    @Override
    public List<UserInfo> findAllUser() throws Exception {
        return userMapper.findAllUser();
    }

    @Override
    public JSONObject add(UserInfo userInfo) throws Exception {
        JSONObject jsonObject = new JSONObject();
        String name = userInfo.getUsername();
        String password = userInfo.getUserpassword();
        int authority = userInfo.getUserauthority();
        int res = userMapper.insertUser(name,password,authority);
        if(res > 0){
            jsonObject.put("info","ok");
            jsonObject.put("msg",res);
        } else {

        }
        return jsonObject;
    }

    @Override
    public JSONObject modifyPwd(String name, String newPwd) throws Exception {
        JSONObject jsonObject = new JSONObject();
        int res = userMapper.updatePassword(name,newPwd);
        if(res > 0){
            jsonObject.put("info","ok");
            jsonObject.put("msg",res);
        } else {
            jsonObject.put("info","err");
            jsonObject.put("msg","err");
        }
        return jsonObject;
    }
}
