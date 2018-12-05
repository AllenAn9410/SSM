package com.ssm.service;

import com.ssm.entity.UserInfo;
import org.json.JSONObject;

import java.util.List;

public interface UserService {
    UserInfo seek(int id, String username) throws Exception;

    UserInfo findByName(String name) throws Exception;

    List<UserInfo> findAllUser() throws Exception;

    JSONObject add(UserInfo userInfo) throws Exception;

    JSONObject modifyPwd(String name,String newPwd) throws Exception;

}
