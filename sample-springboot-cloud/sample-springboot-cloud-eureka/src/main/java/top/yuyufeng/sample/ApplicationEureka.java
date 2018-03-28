package top.yuyufeng.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author yuyufeng
 * @date 2018/3/28
 */
@EnableEurekaServer
@SpringBootApplication
public class ApplicationEureka {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationEureka.class, args);
    }
}
