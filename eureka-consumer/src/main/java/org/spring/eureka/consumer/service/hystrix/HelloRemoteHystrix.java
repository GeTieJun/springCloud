package org.spring.eureka.consumer.service.hystrix;

import org.spring.eureka.consumer.service.HelloRemoteService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author getiejun
 * @date 2022/12/1
 */
@Component
public class HelloRemoteHystrix implements HelloRemoteService {
    @Override
    public String hello(@RequestParam(value = "name") String name) {
        return "hello " +name+", this message send failed ";
    }
}
