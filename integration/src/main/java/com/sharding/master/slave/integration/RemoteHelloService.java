package com.sharding.master.slave.integration;

import com.sharding.master.slave.integration.bean.SayHelloResult;
import com.sharding.master.slave.api.param.SayHelloParam;

/**
 * @author ：Qiao Yansong
 * @date ：Created in 2022/2/9 5:44 下午
 * description：调用远程服务，防腐层demo
 */
public interface RemoteHelloService {

    /**
     * 简单对外的dubbo接口
     * @param param
     * @return
     */
    SayHelloResult sayHello(SayHelloParam param);

}
