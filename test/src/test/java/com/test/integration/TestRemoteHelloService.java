package com.test.integration;

import com.integration.RemoteHelloService;
import com.integration.bean.SayHelloResult;
import com.param.SayHelloParam;
import com.test.BaseTestApplication;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author ：Qiao Yansong
 * @date ：Created in 2022/2/9 7:04 下午
 * description：
 */
public class TestRemoteHelloService extends BaseTestApplication {

    @Autowired
    private RemoteHelloService remoteHelloService;

    @Test
    public void test1() {
        SayHelloParam param = new SayHelloParam();
        param.setUid(1);
        SayHelloResult result = remoteHelloService.sayHello(param);
        System.out.println(result);
    }

}
