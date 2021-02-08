package Myirule;

import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @author ：yang
 * @date ：Created in 2021/2/3 21:55
 * @description：
 * @modified By：
 * @version: $
 */
@Configuration
public class IRule {
    @Bean
    public RandomRule MyIRule(){
        return new RandomRule();
    }
}
