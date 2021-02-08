package com.yl.web.config;

import com.netflix.loadbalancer.BestAvailableRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
/**
 * @author ：yang
 * @date ：Created in 2021/2/6 19:20
 * @description：
 * @modified By：
 * @version: $
 */
@Configuration
public class consumerconfig {
    @Bean
    @LoadBalanced
    public RestTemplate restfultemlate(){
        return new RestTemplate();
    }
}
