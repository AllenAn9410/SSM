package com.ssm.mapper;

import com.ssm.entity.UserInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    UserInfo seek(@Param("userId") int id , @Param("username") String name) throws Exception;

    UserInfo findByName(@Param("username") String name) throws Exception;

    List<UserInfo> findAllUser() throws Exception;

    int insertUser(@Param("username") String name,@Param("password") String password,@Param("authority") int authority) throws Exception;

    int updatePassword(@Param("username")String name,@Param("newPwd")String password) throws Exception;
}
