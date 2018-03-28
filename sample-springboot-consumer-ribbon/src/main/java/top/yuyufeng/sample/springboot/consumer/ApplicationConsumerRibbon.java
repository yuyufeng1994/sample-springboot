package top.yuyufeng.sample.springboot.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author yuyufeng
 * @date 2018/3/28
 */
//注解开启断路器功能
@EnableCircuitBreaker
@EnableEurekaClient
@SpringBootApplication
public class ApplicationConsumerRibbon {
    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
    public static void main(String[] args) {
        SpringApplication.run(ApplicationConsumerRibbon.class, args);
    }
}
