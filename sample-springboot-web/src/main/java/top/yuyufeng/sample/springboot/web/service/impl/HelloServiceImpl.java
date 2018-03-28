package top.yuyufeng.sample.springboot.web.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import top.yuyufeng.sample.springboot.web.service.IHelloService;

/**
 * @author yuyufeng
 * @date 2018/3/28
 */
@Service
public class HelloServiceImpl implements IHelloService{
    @Value("${my-name}")
    private String name;

    @Override
    public String sayHello() {
        return "hello 你好 " + this.name;
    }
}
