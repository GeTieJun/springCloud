package org.spring.eureka.consumer.service;

import org.spring.eureka.consumer.service.hystrix.HelloRemoteHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author getiejun
 * @date 2022/12/1
 */
//@Service
@FeignClient(name = "spring-cloud-product", fallback = HelloRemoteHystrix.class)
public interface HelloRemoteService {

    @RequestMapping(value = "/hello")
    public String hello(@RequestParam(value = "name") String name);
}
