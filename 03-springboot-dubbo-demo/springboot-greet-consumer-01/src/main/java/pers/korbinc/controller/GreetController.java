package pers.korbinc.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.korbinc.service.GreetService;

/**
 * @author : K.B
 * @date : 2020/8/10
 */
@RestController
public class GreetController {

    @Reference
    private GreetService greetService;

    @RequestMapping("hello/{name}")
    public String sayHello(@PathVariable("name") String name) {
        return greetService.sayHello(name);
    }

}
