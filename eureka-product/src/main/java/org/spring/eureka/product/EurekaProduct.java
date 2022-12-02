package org.spring.eureka.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author getiejun
 * @date 2022/12/1
 */
@SpringBootApplication
@EnableDiscoveryClient
public class EurekaProduct {

    public static void main(String[] args) {
        SpringApplication.run(EurekaProduct.class, args);
    }
}
