package com.yl.service;

import com.yl.entities.User;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：yang
 * @date ：Created in 2021/2/5 15:37
 * @description：
 * @modified By：
 * @version: $
 */
@Component
public class UserClientServiceFallBackFactory implements FallbackFactory{
    @Override
    public UserServices create(Throwable cause){
        return new UserServices(){
            @Override
            public List<User> select() {
                System.out.print("faillink");
                return null;
            }

            @Override
            public User selectbyid(Integer id) {
                return null;
            }
        };

    }
}
