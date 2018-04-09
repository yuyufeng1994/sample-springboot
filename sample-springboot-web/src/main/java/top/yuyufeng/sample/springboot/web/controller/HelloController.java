package top.yuyufeng.sample.springboot.web.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import top.yuyufeng.sample.springboot.web.service.IHelloService;

/**
 * @author yuyufeng
 * @date 2018/3/30
 */
@RestController
@RequestMapping("/hello")
@Api(description = "Hello控制层")
public class HelloController {
    @Autowired
    private IHelloService helloService;

    @ApiOperation(value = "say你好Hello", httpMethod = "POST")
    @RequestMapping(value = "/say", method = RequestMethod.POST)
    public String sayHello(@ApiParam(value = "语句") @RequestBody String words) {
        String result = helloService.sayHello(words);
        return result;
    }

    @ApiOperation(value = "获取myName", httpMethod = "GET")
    @RequestMapping(value = "/my-name/{userId}", method = RequestMethod.GET)
    public String getMyName(@ApiParam(value = "语句") @PathVariable("userId") Long userId) {
        return "我的名字：" + userId;
    }
}
