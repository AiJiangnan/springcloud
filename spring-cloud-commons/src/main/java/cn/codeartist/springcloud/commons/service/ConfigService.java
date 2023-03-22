package cn.codeartist.springcloud.commons.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * 配置示例
 *
 * @author 艾江南
 * @date 2023/3/21
 */
@Service
public class ConfigService {

    @Value("${test.value}")
    private String test;
    @Value("${test.common.key}")
    private String common;
    @Value("${test.bootstrap.key}")
    private String bootstrap;
    @Value("${test.application.key}")
    private String application;

    public String getTest() {
        System.out.println("config: " + common);
        System.out.println("config: " + bootstrap);
        System.out.println("config: " + application);
        return this.test;
    }
}
