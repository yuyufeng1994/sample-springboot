package top.yuyufeng.sample.springboot.task.runner;

import org.springframework.boot.CommandLineRunner;

/**
 * @author yuyufeng
 * @date 2018/4/2
 */
public  class HelloCommandLineRunner implements CommandLineRunner {
    @Override
    public void run(String... strings) throws Exception {
        System.out.println("Hello HelloCommandLineRunner");
    }
}
