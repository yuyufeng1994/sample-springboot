package top.yuyufeng.sample.springboot.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.yuyufeng.sample.springboot.web.service.IHelloService;

import java.util.Date;

/**
 * @author yuyufeng
 * @date 2018/3/28
 */
@RestController
public class IndexController {
    @Autowired
    private IHelloService helloService;

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    @RequestMapping("/now")
    String now() {
        return new Date().toLocaleString();
    }

    @RequestMapping("/hello")
    String hello() {
        String result = helloService.sayHello();
        return result;
    }
}
