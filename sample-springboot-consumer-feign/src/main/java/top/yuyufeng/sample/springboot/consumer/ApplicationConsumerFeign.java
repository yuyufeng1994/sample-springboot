package top.yuyufeng.sample.springboot.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author yuyufeng
 * @date 2018/3/28
 */
@SpringBootApplication
@EnableFeignClients
public class ApplicationConsumerFeign {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationConsumerFeign.class, args);
    }
}
