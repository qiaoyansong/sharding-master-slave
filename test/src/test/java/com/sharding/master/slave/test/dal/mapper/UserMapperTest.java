package com.sharding.master.slave.test.dal.mapper;

import com.sharding.master.slave.dal.domain.User;
import com.sharding.master.slave.dal.mapper.UserMapper;
import com.sharding.master.slave.test.BaseTestApplication;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * @author ：Qiao Yansong
 * @date ：Created in 2023/4/8 4:22 下午
 * description：
 */
public class UserMapperTest extends BaseTestApplication {

    @Resource
    private UserMapper userMapper;

    @Test
    public void insert_Test_Simple() {
        User user = new User();
        user.setUname("张三丰");
        System.out.println(userMapper.insert(user));
    }

}
