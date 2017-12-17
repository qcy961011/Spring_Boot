package com.mi.qiao.Service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.mi.qiao.entity.User;

@Component
public interface UserService {

	int deleteByPrimaryKey(Integer id);

	int insert(User record);

	int insertSelective(User record);

	List<User> selectAll();
	
	User selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(User record);

	int updateByPrimaryKey(User record);
}
