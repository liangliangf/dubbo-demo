package cn.liang.consumer;

import cn.liang.api.service.IUserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Consumer implements CommandLineRunner {

    // multicast 注册中心 提供者和消费者在同一台计算机上要配置parameters = {"unicast","false"}，不然报错。
    //@DubboReference(version = "1.0",parameters = {"unicast","false"})
    // Zookeeper 注册中心单机可以
    @DubboReference(version = "1.0")
    private IUserService userService;

    @Override
    public void run(String... args) throws Exception {
        userService.queryUserById(3);
    }
}
