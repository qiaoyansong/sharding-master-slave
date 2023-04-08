package com.sharding.master.slave.biz.helper;

import com.sharding.master.slave.biz.dto.UserInfoDto;
import com.sharding.master.slave.dal.domain.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


/**
 * @author ：Qiao Yansong
 * @date ：Created in 2022/1/27 4:48 下午
 * description：do转换成为dto 辅助类(不使用beanMapper)
 */
@Mapper(componentModel = "spring")
public interface Do2DtoHelper {

    /**
     * userDo 转换成为 dto
     *
     * @param user
     * @return
     */
    @Mapping(source = "username", target = "userName")
    UserInfoDto toUserInfoDto(User user);

}
