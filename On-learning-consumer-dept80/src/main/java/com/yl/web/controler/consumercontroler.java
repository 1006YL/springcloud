package com.yl.web.controler;

import com.yl.entities.User;
import com.yl.service.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
/**
 * @author ：yang
 * @date ：Created in 2021/2/6 19:25
 * @description：
 * @modified By：
 * @version: $
 */
@RestController
public class consumercontroler {

//    Ribbon
//    @Autowired
//    private RestTemplate restTemplate;
//    private static final String REST_URL_PREFIX="http://localhost:8001/";
//    @RequestMapping("/getall/")
//    public List<User> selectall(){
//        return restTemplate.getForObject(REST_URL_PREFIX+"select",List.class);
//    }
    @Autowired
    private UserServices userServices;
    @GetMapping("/getall/")
    public List<User> selectall(){
       return userServices.select();
    }
    @RequestMapping("/getbyid/{id}")
    public User selectbyid(@PathVariable(value ="id") Integer id){
        System.out.print(id);
        return userServices.selectbyid(id);
    }
}
