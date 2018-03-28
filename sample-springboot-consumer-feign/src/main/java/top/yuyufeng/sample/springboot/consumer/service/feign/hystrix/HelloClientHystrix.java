package top.yuyufeng.sample.springboot.consumer.service.feign.hystrix;

import org.springframework.stereotype.Component;
import top.yuyufeng.sample.springboot.consumer.service.feign.HelloClient;

/**
 * @author yuyufeng
 * @date 2018/3/28
 */
@Component
public class HelloClientHystrix implements HelloClient{
    @Override
    public String sayWords(String words) {
        return "Hystrix(熔断器):"+words;
    }
}
