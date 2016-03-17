package com.control;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dao.IuserInfoDao;
import com.entity.userinfo;

/**
 * 用户信息表的Control类
 * @author Auser
 *
 */
@Controller
@RequestMapping("/user")
public class userControl {
	
	@Resource
	private IuserInfoDao userDao;
	
	//得到用户信息
	@RequestMapping("/index.html")
	public String queryUser(HttpServletRequest request)
	{
		//得到所有用户信息
		List<userinfo> userList=userDao.queryUser();
		//保存数据
		request.setAttribute("userList", userList);
		return "index";
	}
	
	//查看用户详细信息
	@RequestMapping("/queryUserbyId.html")
	public String queryUserbyId(HttpServletRequest request,String userId)
	{
		//得到用户详细信息
		userinfo user=userDao.queryUserbyId(userId);
		//保存用户信息
		request.setAttribute("user", user);
		return "userinfoTrol";
	}
	
	//查看修改用户详细信息
	@RequestMapping("/updateueryUserbyId.html")
	public String updateueryUserbyId(HttpServletRequest request,String userId)
	{
		//得到用户详细信息
		userinfo user=userDao.queryUserbyId(userId);
		//保存用户信息
		request.setAttribute("user", user);
		return "updateUserbyId";
	}
	
	//修改用户信息
	@RequestMapping("/updateUserbyId.html")
	public String updateUserbyId(userinfo user)
	{
		//修改用户信息
		userDao.updateUserbyId(user);
		return "index";
	}
	
	//删除用户信息
	@RequestMapping("/deleteUserbyId.html")
	public String deleteUserbyId(String userId,HttpServletRequest request)
	{
		//删除用户信息
		userDao.deleteUserbyId(userId);
		//得到所有用户信息
		List<userinfo> userList=userDao.queryUser();
		//保存数据
		request.setAttribute("userList", userList);
		return "index";
	}
}
