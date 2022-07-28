package com.chenke.chenkeconsumerservice.controller;

import com.chenke.chenkeconsumerservice.IFeignService.IProvideFeignClient;
import com.chenke.common.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenke
 * @version 1.0.0
 * @ClassName ConsumerController.java
 * @Description TODO
 * @createTime 2022年05月02日 18:35:00
 */
@RestController
@RequestMapping(value = "/consumer")
public class ConsumerController {
    @Autowired
    private  IProvideFeignClient provideFeignClient;

    @RequestMapping(value = "/getPort",method = RequestMethod.GET)
    public Result getPort(){
       return  provideFeignClient.getPort();
    }
    @RequestMapping(value = "/timeout",method = RequestMethod.GET)
    public Result timeout(){
        return  provideFeignClient.timeout();
    }

}
