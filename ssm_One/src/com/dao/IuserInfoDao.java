package com.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.entity.userinfo;

public interface IuserInfoDao {

	//查看所有用户信息
	public List<userinfo> queryUser();
	//查看用户详细信息
	public userinfo queryUserbyId(@Param("userId") String userId);
}
