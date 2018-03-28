package top.yuyufeng.sample.springboot.consumer.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author yuyufeng
 * @date 2018/3/28
 */
@RestController
public class IndexController {
    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    @RequestMapping(value = "/say", method = RequestMethod.GET)
    @HystrixCommand(fallbackMethod = "sayFallBack")
    public String say(String words) {
        return restTemplate.getForEntity("http://MY-PROVIDER//hello/say?words="+words, String.class).getBody();
    }

    @RequestMapping(value = "/sayFallBack", method = RequestMethod.GET)
    public String sayFallBack(String words){
        return "熔断器say:" + words;
    }

}
