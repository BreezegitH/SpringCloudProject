package com.chenke.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author chenke
 * @version 1.0.0
 * @ClassName user.java
 * @Description TODO
 * @createTime 2022年05月14日 15:12:00
 */
@Data
public class User implements Serializable {
    static final long serialVersionUID = 42223123L;
    String userid;
    String username;
    String address;

    public User(String userid, String username, String address) {
        this.userid = userid;
        this.username = username;
        this.address = address;
    }
}
