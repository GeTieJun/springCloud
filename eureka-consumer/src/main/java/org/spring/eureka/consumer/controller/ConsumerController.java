package org.spring.eureka.consumer.controller;

import org.spring.eureka.consumer.service.HelloRemoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author getiejun
 * @date 2022/12/1
 */
@RestController
public class ConsumerController {

    @Autowired
    private HelloRemoteService helloRemoteService;

    @RequestMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
        return helloRemoteService.hello(name);
    }
}
