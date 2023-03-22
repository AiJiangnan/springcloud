package cn.codeartist.springcloud.commons;

import cn.codeartist.springcloud.commons.service.ConfigService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Spring Cloud Commons
 *
 * @author 艾江南
 * @date 2023/3/21
 */
@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Main.class, args);

        String test = context.getBean(ConfigService.class).getTest();
        System.out.println("Config Hierarchies: " + test);
    }
}