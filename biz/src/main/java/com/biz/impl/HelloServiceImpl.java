package com.biz.impl;

import com.alibaba.fastjson.JSON;
import com.api.result.SayHelloResult;
import com.biz.dto.UserInfoDto;
import com.biz.helper.Do2DtoHelper;
import com.biz.service.HelloService;
import com.common.utils.LogFactory;
import com.dal.domain.User;
import com.dal.mapper.UserMapper;
import com.param.SayHelloParam;
import org.slf4j.Logger;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author ：Qiao Yansong
 * @date ：Created in 2022/1/25 8:46 下午
 * description：
 */
@Service
public class HelloServiceImpl implements HelloService {

    private static final Logger LOG = LogFactory.BIZ_SERVICE_LOG;

    @Resource
    private UserMapper userMapper;

    @Resource
    private Do2DtoHelper do2DtoHelper;

    @Override
    public SayHelloResult sayHello(SayHelloParam param) {
        LOG.info("[HelloServiceImpl#sayHello] begin,param={}", JSON.toJSONString(param));
        SayHelloResult result = new SayHelloResult();
        User user = userMapper.fetchUserInfo(param.getUid());
        if(user != null) {
            UserInfoDto userInfoDto = do2DtoHelper.toUserInfoDto(user);
            result.setMessage(userInfoDto.getUserName() + ",你好");
        }
        return result;
    }

}
