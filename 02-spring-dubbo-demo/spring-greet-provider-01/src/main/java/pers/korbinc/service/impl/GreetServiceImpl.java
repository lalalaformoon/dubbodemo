package pers.korbinc.service.impl;

import pers.korbinc.service.GreetService;

/**
 * @author : KorbinC
 * @date : 2020/8/9
 */
public class GreetServiceImpl implements GreetService {
    public String sayHello(String name) {
        System.out.println("Received name: " + name);
        return "Hello " + name;
    }
}
