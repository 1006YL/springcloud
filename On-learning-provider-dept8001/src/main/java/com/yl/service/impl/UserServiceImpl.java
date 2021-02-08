package com.yl.service.impl;

import com.yl.entities.User;
import com.yl.mapper.UserMapper;
import com.yl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;
	
	


	public List<User> selectall(){return userMapper.selectall();}

	public User selectbyid(Integer id){System.out.print(id); return userMapper.selectbyid(id);}

}
