package com.dao;

import java.util.List;

import com.entity.userinfo;

public interface IuserInfoDao {

	//查看所有用户信息
	public List<userinfo> queryUser();
}
