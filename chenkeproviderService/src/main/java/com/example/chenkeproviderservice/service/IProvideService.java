package com.example.chenkeproviderservice.service;

import com.chenke.common.Result;

/**
 * @author chenke
 * @version 1.0.0
 * @ClassName IProvideService.java
 * @Description TODO
 * @createTime 2022年05月02日 12:45:00
 */
public interface IProvideService {
    public Result getPort();

    Result timeout();
}
