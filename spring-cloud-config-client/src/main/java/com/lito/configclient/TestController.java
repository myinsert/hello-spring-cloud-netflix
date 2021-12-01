package com.lito.configclient;

import org.springframework.beans.factory.annotation.Value;
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
public class TestController {

    @Value("${server.port}")
    private String port;

    @Value("${word}")
    private String word;

    /**
     * 此处需要加 @RequestParam 注解
     * @param message
     * @return
     */
    @RequestMapping(value = "sayHi", method = RequestMethod.GET)
    public String sayHi(@RequestParam(value = "message") String message) {
        return String.format("Hi，your message is : %s i am configClient word : %s from port : %s  dateTime %s", message,word, port,System.currentTimeMillis());
    }

}
