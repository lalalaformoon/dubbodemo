package pers.korbinc.service.impl;

import org.springframework.stereotype.Service;
import pers.korbinc.service.GreetService;

/**
 * @author : KorbinC
 * @date : 2020/8/10
 */
@com.alibaba.dubbo.config.annotation.Service    //暴露服务
@Service
public class GreetServiceImpl implements GreetService {
    public String sayHello(String name) {
        System.out.println("Received name: " + name);
        return "Hello " + name + " (from Spring Boot)";
    }
}
