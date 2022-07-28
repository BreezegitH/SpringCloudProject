package com.chenke.chenkeconsumerservice.IFeignService;

import com.chenke.common.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author chenke
 * @version 1.0.0
 * @ClassName IProvideFeignClient.java
 * @Description TODO
 * @createTime 2022年05月02日 18:29:00
 */
@FeignClient(name="service-provider")
@Component
public interface IProvideFeignClient {
    @RequestMapping(method = RequestMethod.GET, value = "/provide/getPort")
    Result getPort();

    @RequestMapping(method = RequestMethod.GET, value = "/provide/timeout")
    Result timeout();

}
