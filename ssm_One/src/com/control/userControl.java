package com.control;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dao.IuserInfoDao;
import com.entity.userinfo;

/**
 * �û���Ϣ���Control��
 * @author Auser
 *
 */
@Controller
@RequestMapping("/user")
public class userControl {
	
	@Resource
	private IuserInfoDao userDao;
	
	//�õ��û���Ϣ
	@RequestMapping("/index.html")
	public String queryUser(HttpServletRequest request)
	{
		//�õ������û���Ϣ
		List<userinfo> userList=userDao.queryUser();
		//��������
		request.setAttribute("userList", userList);
		return "index";
	}
}
