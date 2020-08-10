package pers.korbinc;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author : KorbinC
 * @date : 2020/8/10
 */
@EnableDubbo
@SpringBootApplication
public class Provider01Application {

    public static void main(String[] args) {
        SpringApplication.run(Provider01Application.class, args);
    }

}
