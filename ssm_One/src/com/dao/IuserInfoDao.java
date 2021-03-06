package com.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.entity.userinfo;

public interface IuserInfoDao {

	//查看所有用户信息
	public List<userinfo> queryUser();
	//查看用户详细信息
	public userinfo queryUserbyId(@Param("userId") String userId);
	//修改用户信息
	public void updateUserbyId(@Param("user") userinfo user);
	//删除用户信息
	public void deleteUserbyId(@Param("userId") String userId);
}
