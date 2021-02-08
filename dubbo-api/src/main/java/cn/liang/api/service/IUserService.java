package cn.liang.api.service;

import cn.liang.api.pojo.User;

public interface IUserService {

    /**
     * 查询用户根据Id
     * @param id 用户Id
     * @return User
     */
    User queryUserById(Integer id);
}
