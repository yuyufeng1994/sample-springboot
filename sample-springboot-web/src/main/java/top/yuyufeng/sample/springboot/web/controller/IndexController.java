package top.yuyufeng.sample.springboot.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import top.yuyufeng.sample.springboot.web.service.IHelloService;

import java.util.Date;

/**
 * @author yuyufeng
 * @date 2018/3/28
 */
@RestController
public class IndexController {

    @RequestMapping(value = "/",method = RequestMethod.GET)
    String home() {
        return "Hello World!";
    }

    @RequestMapping(value = "/now",method = RequestMethod.GET)
    String now() {
        return new Date().toLocaleString();
    }


}
