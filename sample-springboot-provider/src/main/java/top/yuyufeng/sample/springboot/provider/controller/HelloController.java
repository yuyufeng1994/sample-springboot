package top.yuyufeng.sample.springboot.provider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import top.yuyufeng.sample.springboot.provider.service.IHelloService;

/**
 * @author yuyufeng
 * @date 2018/3/28
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
    @Autowired
    private IHelloService helloService;

    @RequestMapping(value = "/say",method = RequestMethod.GET)
    public String sayWords(@RequestParam String words) {
        String result = helloService.sayHello(words);
        return result;
    }
}
