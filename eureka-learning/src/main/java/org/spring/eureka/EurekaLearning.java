package org.spring.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author getiejun
 * @date 2022/11/9
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaLearning {
    public static void main(String[] args) {
        SpringApplication.run(EurekaLearning.class, args);
    }
}
