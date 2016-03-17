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
}
