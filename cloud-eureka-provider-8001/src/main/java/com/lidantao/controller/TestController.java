package com.lidantao.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Cola
 * @Date 2022年01月25日 09:01:00
 */
@RestController
@Slf4j
public class TestController {

    @RequestMapping("/provider/getTest")
    public String getTest(){
        log.info("*********************Eureka-Provider-8001********************************");
        return "Eureka Provider 8001";
    }


}
