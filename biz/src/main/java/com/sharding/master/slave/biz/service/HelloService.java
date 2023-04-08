package com.sharding.master.slave.biz.service;

import com.sharding.master.slave.api.param.SayHelloParam;
import com.sharding.master.slave.api.result.SayHelloResult;

/**
 * @author ：Qiao Yansong
 * @date ：Created in 2022/1/25 8:45 下午
 * description：
 */
public interface HelloService {

    /**
     * 简单的业务实现
     * @param param
     * @return
     */
    SayHelloResult sayHello(SayHelloParam param);

}
