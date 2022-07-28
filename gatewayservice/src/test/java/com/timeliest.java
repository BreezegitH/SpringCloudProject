package com;

import java.time.ZonedDateTime;

/**
 * @author chenke
 * @version 1.0.0
 * @ClassName timetest.java
 * @Description TODO
 * @createTime 2022年05月08日 18:12:00
 */
public class timeliest {

    public static void main(String[] args) {
        ZonedDateTime zt= ZonedDateTime.now();
        System.out.println(zt.toString());
    }
}
