package pers.korbinc;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pers.korbinc.service.GreetService;

import java.io.IOException;

/**
 * @author : KorbinC
 * @date : 2020/8/9
 */
public class Consumer01Application {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        GreetService greetService = (GreetService) context.getBean("greetService");
        String helloStr = greetService.sayHello("KorbinC"); // 执行远程方法
        System.out.println(helloStr); // 显示调用结果
        System.in.read(); // 按任意键退出
    }

}
