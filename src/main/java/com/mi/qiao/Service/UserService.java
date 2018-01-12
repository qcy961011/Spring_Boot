package com.mi.qiao.Service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.mi.qiao.entity.User;

@Component
public interface UserService{
	public int deleteByPrimaryKey(Integer id) ;
	public int insert(User record);
	public int insertSelective(User record) ;
	public User selectByPrimaryKey(Integer id);
	public int updateByPrimaryKeySelective(User record);
	public int updateByPrimaryKey(User record);
	public List<User> selectAll();
	

}