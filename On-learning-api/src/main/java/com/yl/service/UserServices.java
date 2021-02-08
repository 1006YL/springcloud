package com.yl.service;

import com.yl.entities.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author ：yang
 * @date ：Created in 2021/2/3 15:27
 * @description：
 * @modified By：
 * @version: $
 */
@Service
@FeignClient(value="http://PROVIDER-SERVICE",fallbackFactory = UserClientServiceFallBackFactory.class)
public interface UserServices {
    @GetMapping("/select")
    public List<User> select();
    @RequestMapping("/selectbyid/{id}")
    public User selectbyid(@PathVariable("id") Integer id);
}
