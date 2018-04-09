package top.yuyufeng.sample.springboot.task.runner;

import org.springframework.boot.CommandLineRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yuyufeng
 * @date 2018/4/2
 */
public  class TestCommandLineRunner implements CommandLineRunner {
    @Override
    public void run(String... strings) throws Exception {
        System.out.println("Hello TestCommandLineRunner");
    }
}
