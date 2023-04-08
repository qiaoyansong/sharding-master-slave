package spock.base

import com.sharding.master.slave.api.HelloRpcService
import com.sharding.master.slave.biz.helper.Do2DtoHelper
import com.sharding.master.slave.biz.impl.HelloServiceImpl
import com.sharding.master.slave.biz.service.HelloService
import com.dal.mapper.UserMapper
import com.sharding.master.slave.service.HelloRpcServiceImpl
import com.sharding.master.slave.test.utils.MockHelper
import org.mapstruct.factory.Mappers
import org.mockito.Mockito
import spock.lang.Specification
/**
 * @author ：Qiao Yansong
 * @date ：Created in 2022/3/28 23:16
 * description：不基于IOC容器的base类
 */
class SpockBddBaseTest extends Specification {

    HelloRpcService helloRpcService;
    HelloService helloService;
    UserMapper userMapper;
    Do2DtoHelper do2DtoHelper;

    {
        // 确定的上下游服务
        helloRpcService = new HelloRpcServiceImpl();
        helloService = new HelloServiceImpl();
        do2DtoHelper = Mappers.getMapper( Do2DtoHelper.class);;

        // 不确定的上下游服务，直接mock出来
        userMapper = Mockito.mock(UserMapper.class);

        MockHelper.mockField(helloRpcService, "helloService", helloService);
        MockHelper.mockField(helloService, "do2DtoHelper", do2DtoHelper);
        MockHelper.mockField(helloService, "userMapper", userMapper);
    }
    
}
