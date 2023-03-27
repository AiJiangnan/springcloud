package cn.codeartist.springcloud.gateway;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Gateway
 *
 * @author 艾江南
 * @date 2023/3/27
 */
@SpringBootApplication(proxyBeanMethods = false)
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}