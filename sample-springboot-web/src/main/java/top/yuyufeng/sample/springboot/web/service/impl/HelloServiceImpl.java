package top.yuyufeng.sample.springboot.web.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;
import top.yuyufeng.sample.springboot.web.service.IHelloService;

/**
 * @author yuyufeng
 * @date 2018/3/28
 */
@Service
@RefreshScope
public class HelloServiceImpl implements IHelloService {
    @Value("${my-name}")
    private String name;

    @Override
    public String sayHello(String words) {
        return "hello 你好 " + this.name + " " + words;
    }
}
