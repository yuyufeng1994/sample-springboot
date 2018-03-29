package top.yuyufeng.sample.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author yuyufeng
 * @date 2018/3/28
 */
@EnableConfigServer
//@EnableEurekaClient
@SpringBootApplication
public class ApplicationConfigServer {
    public static void main(String[] args) {
        //http://127.0.0.1:6018/my-name/test
        SpringApplication.run(ApplicationConfigServer.class, args);
    }
}
