package com.ssm;

import com.ssm.entity.UserInfo;
import com.ssm.service.UserService;
import org.apache.log4j.Logger;
import org.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:conf/spring-mybatis.xml","classpath:conf/spring-service.xml"})
public class TestMybatis {

    private static Logger logger = Logger.getLogger(TestMybatis.class);

    @Autowired
    UserService userService ;

    @Test
    public void testSeek()  throws Exception{
        int id = 5;
        String name = "kfc";
        UserInfo userInfo = userService.seek(id,name);
        logger.info(userInfo.toString());

    }

    @Test
    public void testFindByName() throws Exception{
        String name = "xiaoming";
        UserInfo userInfo = userService.findByName(name);
        logger.info(userInfo.toString());
    }

    @Test
    public void testFindAllUser() throws Exception{
        List<UserInfo> list = userService.findAllUser();
        for(int i=0;i<list.size();i++){
            String str = list.get(i).toString();
            logger.info(str);
        }

    }

    @Test
    public void testAdd() throws Exception{
        UserInfo userInfo = new UserInfo();
        userInfo.setUsername("kfc");
        userInfo.setUserpassword("kfc");
        userInfo.setUserauthority(10);
        JSONObject jsonObject = userService.add(userInfo);
        logger.info(jsonObject.toString());
    }

    @Test
    public void testModifyPwd() throws Exception{
        String name = "kfc";
        String newPwd = "MMM";
        JSONObject jsonObject = userService.modifyPwd(name,newPwd);
        logger.info(jsonObject.toString());
    }


}
