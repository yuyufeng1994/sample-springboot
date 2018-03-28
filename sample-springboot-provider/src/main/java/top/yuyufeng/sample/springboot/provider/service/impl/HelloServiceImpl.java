package top.yuyufeng.sample.springboot.provider.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import top.yuyufeng.sample.springboot.provider.service.IHelloService;

/**
 * @author yuyufeng
 * @date 2018/3/28
 */
@Service
public class HelloServiceImpl implements IHelloService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public String sayHello(String words) {
        logger.info("Provider说：" + words);
        return "Provider说：" + words;
    }
}
