package com.lidantao.controller;

import com.lidantao.service.OpenFeignService.OpenFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Cola
 * @Date 2022年01月23日 13:17:00
 */
@RestController
public class TestController {

    @Autowired
    private OpenFeignService openFeignService;

    @RequestMapping("/consumer/openFeign/getTest")
    public String getTest(){
        return openFeignService.getTest();
    }
}
