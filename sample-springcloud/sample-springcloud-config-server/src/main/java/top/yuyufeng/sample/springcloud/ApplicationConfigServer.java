package top.yuyufeng.sample.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author yuyufeng
 * @date 2018/3/28
 */
@EnableConfigServer
@SpringBootApplication
public class ApplicationConfigServer {
    public static void main(String[] args) {
        //http://127.0.0.1:6018/my-name/test
        SpringApplication.run(ApplicationConfigServer.class, args);
    }
}
