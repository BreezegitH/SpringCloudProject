package com.chenke.chenkeconsumerservice.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @author chenke
 * @version 1.0.0
 * @ClassName sentinelController.java
 * @Description TODO
 * @createTime 2022年05月04日 09:02:00
 */
@RestController
@Slf4j
public class sentinelController {
    @RequestMapping(value="/sentineltest")
    public String RequestMapping() {

       log.info("YES,sentineltest");
           // TimeUnit.SECONDS.sleep(2);

        return "YES,sentineltest";
    }
}
