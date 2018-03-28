package top.yuyufeng.sample.springboot.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import top.yuyufeng.sample.springboot.consumer.service.feign.HelloClient;

/**
 * @author yuyufeng
 * @date 2018/3/28
 */
@RestController
public class IndexController {
    @Autowired
    HelloClient helloClient;

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    @RequestMapping(value = "/say", method = RequestMethod.GET)
    public String say(String words) {
        return helloClient.sayWords(words);
    }
}
