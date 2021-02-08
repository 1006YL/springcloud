package com.yl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
/**
 * @author ：yang
 * @date ：Created in 2021/2/7 11:22
 * @description：
 * @modified By：
 * @version: $
 */
@SpringBootApplication
@EnableConfigServer
public class Configservice3344 {
    public static void main(String[] args) {
        SpringApplication.run(Configservice3344.class,args);
    }
}
