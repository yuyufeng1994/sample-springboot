package top.yuyufeng.sample.springboot.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author yuyufeng
 * @date 2018/3/28
 */
@SpringBootApplication
@EnableEurekaClient
public class ApplicationWeb {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(ApplicationWeb.class, args);
    }
}
