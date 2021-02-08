package web;

import Myirule.IRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
//在微服务启动时加载自定义类
@RibbonClient(name = "PROVIDER-SERVICE",configuration = IRule.class)
public class dept80 {
    public static void main(String[] args) {
        SpringApplication.run(dept80.class,args);
    }
}
