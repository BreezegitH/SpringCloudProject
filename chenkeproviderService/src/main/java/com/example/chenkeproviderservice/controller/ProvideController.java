package com.example.chenkeproviderservice.controller;

import com.chenke.common.Result;
import com.example.chenkeproviderservice.service.IProvideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.annotation.Resources;
import java.util.concurrent.TimeUnit;

/**
 * @author chenke
 * @version 1.0.0
 * @ClassName ProvideController.java
 * @Description TODO
 * @createTime 2022年05月02日 12:52:00
 */
@RestController
@RequestMapping(value = "provide")
public class ProvideController {

    @Autowired
    IProvideService provideService;

    @RequestMapping("/getPort")
    public Result getPort(){
       return  provideService.getPort();
    }
    @RequestMapping("/timeout")
    public Result timeout()   {
        return  provideService.timeout();
    }

}
