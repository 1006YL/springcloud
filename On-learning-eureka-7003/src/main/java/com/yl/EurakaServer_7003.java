package com.yl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author ：yang
 * @date ：Created in 2021/2/1 22:16
 * @description：
 * @modified By：
 * @version: $
 */
@SpringBootApplication
@EnableEurekaServer
public class EurakaServer_7003 {
    public static void main(String[] args) {
        SpringApplication.run(EurakaServer_7003.class,args);
    }
}
