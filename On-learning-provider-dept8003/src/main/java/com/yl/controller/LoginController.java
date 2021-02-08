package com.yl.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.yl.entities.User;
import com.yl.service.UserService;
import com.yl.service.UserServices;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


/**
 * @author ：yang
 * @date ：Created in 2021/2/4 13:15
 * @description：
 * @modified By：
 * @version: $
 */
@RestController
@ResponseBody
public class LoginController {
	
	@Autowired
	private UserService userService;
//	@HystrixCommand(fallbackMethod = "testerror0",groupKey = "Group1",threadPoolKey= "1")
//	@RequestMapping("/testerror")
//	public RuntimeException testerror(){
//		return new RuntimeException("error");
//	}
//
//	public RuntimeException testerror0(){
//		return new RuntimeException("error123456");
//	}
//	@HystrixCommand(fallbackMethod = "hystrixGetall",
//			commandProperties = {
//					@HystrixProperty(name="execution.isolation.thread.timeoutInMillionseconds", value="SEMAPHORE")
//			})
	@RequestMapping("/select")
	public List<User> selectall() {
		return userService.selectall();
	}

	@HystrixCommand(fallbackMethod = "hystrixGet",
			commandProperties = {
			@HystrixProperty(name="execution.isolation.strategy", value="SEMAPHORE")
	}
	)
	@RequestMapping("/selectbyid/{id}")
	public User selectbyid(@PathVariable("id") Integer id){
		System.out.print(id);
		return userService.selectbyid(id);
	}


	public User hystrixGet(@PathVariable(value ="id") Integer id){
				User user=new User();
				user.setUserId(0);
				user.setUserName("请求超时");
				user.setDb("在MySQL中没有这个数据库");
				return  user;
	}

	public List<User> hystrixGetall(){
		User user=new User();
		user.setUserId(0);
		user.setUserName("这个id=>,没有对应的信息,null---@Hystrix~");
		user.setDb("在MySQL中没有这个数据库");
		List<User> users=new ArrayList<User>();
		users.add(user);
		return  users;
	}
}
