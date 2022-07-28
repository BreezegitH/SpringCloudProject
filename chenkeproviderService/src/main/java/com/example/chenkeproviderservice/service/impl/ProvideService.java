package com.example.chenkeproviderservice.service.impl;

import com.chenke.common.Result;
import com.chenke.common.ResultCode;
import com.example.chenkeproviderservice.service.IProvideService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author chenke
 * @version 1.0.0
 * @ClassName ProvideService.java
 * @Description TODO
 * @createTime 2022年05月02日 12:46:00
 */
@Service
public class ProvideService implements IProvideService {

    @Value("${server.port}")
    private  String port;
    @Override
    public Result getPort() {
        Result rs=new Result();
        rs.setResultCode(ResultCode.SUCCESS);
        rs.setData(port);
        rs.setMsg("操作成功！");
        return rs;
    }

    @Override
    public Result timeout() {
        Result rs=new Result();
        try {
            TimeUnit.SECONDS.sleep(3);
            rs.setResultCode(ResultCode.SUCCESS);
        } catch (InterruptedException e) {
            e.printStackTrace();
            rs.setResultCode(ResultCode.FAILURE);
        }
        rs.setData("延时结束");
        rs.setMsg("操作成功！");
        return rs;
    }
}
