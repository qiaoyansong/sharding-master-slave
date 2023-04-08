package com.sharding.master.slave.service;

import com.alibaba.fastjson.JSON;
import com.sharding.master.slave.api.HelloRpcService;
import com.sharding.master.slave.api.result.RpcResult;
import com.sharding.master.slave.api.result.SayHelloResult;
import com.sharding.master.slave.api.utils.RpcResultUtil;
import com.sharding.master.slave.biz.service.HelloService;
import com.sharding.master.slave.common.enums.ErrorEnum;
import com.sharding.master.slave.common.exception.BizException;
import com.sharding.master.slave.common.utils.LogFactory;
import com.sharding.master.slave.common.utils.ValidatorHelper;
import com.sharding.master.slave.api.param.SayHelloParam;
import org.slf4j.Logger;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author ：Qiao Yansong
 * @date ：Created in 2022/1/25 8:10 下午
 * description：
 */
@Service
public class HelloRpcServiceImpl implements HelloRpcService {

    private static final Logger log = LogFactory.SERVICE_LOG;

    @Resource
    private HelloService helloService;

    @Override
    public RpcResult<SayHelloResult> sayHello(SayHelloParam param) {
        log.info("[HelloRpcServiceImpl#sayHello] param is {}", JSON.toJSONString(param));
        try {
            // ①参数校验
            ValidatorHelper.validate(param);
            // ②业务计算
            return RpcResultUtil.success(helloService.sayHello(param));
        } catch (BizException e) {
            log.warn("[HelloRpcServiceImpl#sayHello] bizError, msg={}", e.getMsg());
            return RpcResultUtil.fail(null, e.getCode(), e.getMsg());
        } catch (Exception e) {
            log.error("[HelloRpcServiceImpl#sayHello] error,e=", e);
            return RpcResultUtil.fail(null, ErrorEnum.INNER_ERROR.getCode(), ErrorEnum.INNER_ERROR.getMsg());
        }
    }

}
