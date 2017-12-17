package com.mi.qiao.dao;

import java.util.List;

import com.mi.qiao.entity.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    List<User> selectAll();
    
    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}