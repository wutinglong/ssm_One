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
	
	//�鿴�û���ϸ��Ϣ
	@RequestMapping("/queryUserbyId.html")
	public String queryUserbyId(HttpServletRequest request,String userId)
	{
		//�õ��û���ϸ��Ϣ
		userinfo user=userDao.queryUserbyId(userId);
		//�����û���Ϣ
		request.setAttribute("user", user);
		return "userinfoTrol";
	}
	
	//�鿴�޸��û���ϸ��Ϣ
	@RequestMapping("/updateueryUserbyId.html")
	public String updateueryUserbyId(HttpServletRequest request,String userId)
	{
		//�õ��û���ϸ��Ϣ
		userinfo user=userDao.queryUserbyId(userId);
		//�����û���Ϣ
		request.setAttribute("user", user);
		return "updateUserbyId";
	}
	
	//�޸��û���Ϣ
	@RequestMapping("/updateUserbyId.html")
	public String updateUserbyId(userinfo user)
	{
		//�޸��û���Ϣ
		userDao.updateUserbyId(user);
		return "index";
	}
	
	//ɾ���û���Ϣ
	@RequestMapping("/deleteUserbyId.html")
	public String deleteUserbyId(String userId,HttpServletRequest request)
	{
		//ɾ���û���Ϣ
		userDao.deleteUserbyId(userId);
		//�õ������û���Ϣ
		List<userinfo> userList=userDao.queryUser();
		//��������
		request.setAttribute("userList", userList);
		return "index";
	}
}
