package com.mi.qiao.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mi.qiao.Service.UserService;
import com.mi.qiao.dao.UserMapper;
import com.mi.qiao.entity.User;

@Component
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return userMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(User record) {
		// TODO Auto-generated method stub
		return userMapper.insert(record);
	}

	@Override
	public int insertSelective(User record) {
		// TODO Auto-generated method stub
		return userMapper.insertSelective(record);
	}

	@Override
	public User selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return userMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(User record) {
		// TODO Auto-generated method stub
		return userMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(User record) {
		// TODO Auto-generated method stub
		return userMapper.updateByPrimaryKey(record);
	}

	@Override
	public List<User> selectAll() {
		// TODO Auto-generated method stub
		return userMapper.selectAll();
	}

}
