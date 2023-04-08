package com.sharding.master.slave.test.service;

import com.sharding.master.slave.api.HelloRpcService;
import com.sharding.master.slave.api.constant.RpcCode;
import com.sharding.master.slave.api.result.RpcResult;
import com.sharding.master.slave.api.result.SayHelloResult;
import com.sharding.master.slave.api.param.SayHelloParam;
import com.sharding.master.slave.test.BaseTestApplication;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author ：Qiao Yansong
 * @date ：Created in 2022/1/25 6:45 下午
 * description：
 */
public class TestHelloRpcService extends BaseTestApplication {

    @Autowired
    private HelloRpcService helloRpcService;

    @Test
    public void testSayHello(){
        RpcResult<SayHelloResult> rpcResult = helloRpcService.sayHello(new SayHelloParam(0));
        Assert.assertNotNull(rpcResult);
        Assert.assertEquals(rpcResult.getCode(), RpcCode.SUCCESS);
        Assert.assertNotNull(rpcResult.getData());
        System.out.println(rpcResult.getData().getMessage());
    }
}
