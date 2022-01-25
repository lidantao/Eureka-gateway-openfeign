package com.lidantao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Cola
 * @Date 2022年01月25日 09:04:00
 */
@SpringBootApplication
@EnableFeignClients
public class EurekaConsumerMain9001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaConsumerMain9001.class, args);
    }
}
