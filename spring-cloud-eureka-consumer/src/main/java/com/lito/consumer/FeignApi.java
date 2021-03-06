package com.lito.consumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Auther: yoult
 * @Description: TODO
 * @LoginName: ZDGG
 * @Date: 2021-11-29 20:09 ζζδΈ
 */
@FeignClient(value = "hello-spring-cloud-producer",fallback = FeignApiFallBack.class)
public interface FeignApi {

    @RequestMapping("/sayHi")
    String sayHi(@RequestParam("message") String message);
}
