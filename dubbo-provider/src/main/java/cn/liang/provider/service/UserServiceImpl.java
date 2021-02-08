package cn.liang.provider.service;

import cn.liang.api.pojo.User;
import cn.liang.api.service.IUserService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService(version = "1.0")
public class UserServiceImpl implements IUserService {

    @Override
    public User queryUserById(Integer id) {
        User user=new User();
        user.setUserId(id);
        user.setUserName("张三");
        System.out.println("接受到的ID:"+id);
        return user;
    }
}
