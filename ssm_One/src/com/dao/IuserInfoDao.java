package com.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.entity.userinfo;

public interface IuserInfoDao {

	//�鿴�����û���Ϣ
	public List<userinfo> queryUser();
	//�鿴�û���ϸ��Ϣ
	public userinfo queryUserbyId(@Param("userId") String userId);
}
