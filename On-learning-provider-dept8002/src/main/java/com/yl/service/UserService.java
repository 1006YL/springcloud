package com.yl.service;


import com.yl.entities.User;

import java.util.List;

public interface UserService {

	 public List<User> selectall();
	 public User selectbyid(Integer id);
}
