package com.lidantao.service.OpenFeignService;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("provider")
public interface OpenFeignService {

    @RequestMapping("provider/getTest")
    public String getTest();

}
