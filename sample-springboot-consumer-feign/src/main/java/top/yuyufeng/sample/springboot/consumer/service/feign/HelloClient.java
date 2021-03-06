package top.yuyufeng.sample.springboot.consumer.service.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import top.yuyufeng.sample.springboot.consumer.service.feign.hystrix.HelloClientHystrix;

/**
 * @author yuyufeng
 * @date 2018/3/28
 */
@FeignClient(value = "my-provider",fallback = HelloClientHystrix.class)
public interface HelloClient {
    /**
     * 提供层服务
     * @param words
     * @return
     */
    @RequestMapping(value = "/hello/say",method = RequestMethod.GET)
    String sayWords(@RequestParam("words") String words);
}
