package com.sharding.master.slave.test;

import com.sharding.master.slave.api.HelloRpcService;
import com.sharding.master.slave.biz.helper.Do2DtoHelper;
import com.sharding.master.slave.biz.impl.HelloServiceImpl;
import com.sharding.master.slave.biz.service.HelloService;
import com.sharding.master.slave.dal.mapper.UserMapper;
import com.sharding.master.slave.service.HelloRpcServiceImpl;
import com.sharding.master.slave.test.utils.MockHelper;
import lombok.Getter;
import org.junit.Before;
import org.mapstruct.factory.Mappers;
import org.mockito.Mockito;

/**
 * @author ：Qiao Yansong
 * @date ：Created in 2022/1/26 10:26 上午
 * description：
 */
@Getter
public class BaseTddTest {

    protected HelloRpcService helloRpcService;

    protected HelloService helloService;

    protected UserMapper userMapper;

    protected Do2DtoHelper do2DtoHelper;

    @Before
    public void init() throws Exception {
        // 确定的上下游服务
        helloRpcService = new HelloRpcServiceImpl();
        helloService = new HelloServiceImpl();
        MockHelper.mockField(helloRpcService, "helloService", helloService);
        do2DtoHelper = Mappers.getMapper( Do2DtoHelper.class);
        MockHelper.mockField(helloService, "do2DtoHelper", do2DtoHelper);

        // 不确定的上下游服务，直接mock出来
        userMapper = Mockito.mock(UserMapper.class);
        MockHelper.mockField(helloService, "userMapper", userMapper);
    }
}
