package com.lito.eurekadiscovery01;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Auther: yoult
 * @Description: TODO
 * @LoginName: ZDGG
 * @Date: 2021-11-29 20:10 星期一
 */
@Component
public class FeignApiFallBack implements FeignApi {

    @Value("${server.port}")
    private String port;

    @Override
    public String sayHi(String message) {
        return String.format("Hi，your message is : %s i am from port : %s", message,port);
    }
}
