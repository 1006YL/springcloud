package com.yl.mapper;

import java.util.List;
import java.util.Map;

import com.yl.entities.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import javax.websocket.server.PathParam;
/**
 * @author ：yang
 * @date ：Created in 2021/2/4 13:10
 * @description：
 * @modified By：
 * @version: $
 */

@Mapper
@Component
public interface UserMapper {
	@Select("select * from user;")
	List<User> selectall();
	@Select("select * from user where userId= #{id};")
	User selectbyid(@PathParam(value ="id") Integer id);
}
