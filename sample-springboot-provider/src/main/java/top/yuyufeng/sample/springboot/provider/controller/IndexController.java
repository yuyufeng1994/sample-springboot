package top.yuyufeng.sample.springboot.provider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.yuyufeng.sample.springboot.provider.service.IHelloService;

import java.util.Date;

/**
 * @author yuyufeng
 * @date 2018/3/28
 */
@RestController
public class IndexController {


    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    @RequestMapping("/now")
    String now() {
        return new Date().toLocaleString();
    }


}
