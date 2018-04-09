package top.yuyufeng.sample.springboot.task;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;
import top.yuyufeng.sample.springboot.task.runner.HelloCommandLineRunner;
import top.yuyufeng.sample.springboot.task.runner.TestCommandLineRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yuyufeng
 * @date 2018/4/2
 */
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
@EnableTask
public class ApplicationTask {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationTask.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner1() {
        return new TestCommandLineRunner();
    }

    @Bean
    public CommandLineRunner commandLineRunner2() {
        return new HelloCommandLineRunner();
    }


}
