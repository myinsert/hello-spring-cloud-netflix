package com.lito.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: yoult
 * @Description: TODO
 * @LoginName: ZDGG
 * @Date: 2021-11-29 15:18 星期一
 */
@RestController
@EnableHystrix
public class TestController {



    @Autowired
    private FeignApi feignApi;

    @RequestMapping(value = "sayHi", method = RequestMethod.GET)
    public String sayHi(@RequestParam(value = "message") String message) {
        return feignApi.sayHi(message);
    }



}
