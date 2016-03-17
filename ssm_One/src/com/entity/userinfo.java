package com.entity;

/**
 * 用户信息表
 * @author Auser
 *
 */
public class userinfo {

		private String userId;
		private String userName;
		private int userAge;
		public String getUserId() {
			return userId;
		}
		public void setUserId(String userId) {
			this.userId = userId;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public int getUserAge() {
			return userAge;
		}
		public void setUserAge(int userAge) {
			this.userAge = userAge;
		}
		public userinfo() {
			super();
			// TODO Auto-generated constructor stub
		}
		public userinfo(String userId, String userName, int userAge) {
			super();
			this.userId = userId;
			this.userName = userName;
			this.userAge = userAge;
		}
		
}
