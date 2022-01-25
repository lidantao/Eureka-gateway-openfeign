package com.lidantao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Cola
 * @Date 2022年01月25日 09:00:00
 */
@SpringBootApplication
@EnableEurekaClient
public class EurekaProviderMain8001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaProviderMain8001.class, args);
    }
}
