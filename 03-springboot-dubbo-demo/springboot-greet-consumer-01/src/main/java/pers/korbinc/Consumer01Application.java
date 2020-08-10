package pers.korbinc;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author : K.B
 * @date : 2020/8/10
 */
@EnableDubbo
@SpringBootApplication
public class Consumer01Application {

    public static void main(String[] args) {
        SpringApplication.run(Consumer01Application.class, args);
    }

}
