package com.hibernate.bean;

public class UserRegister {
	private int user_reg_id;
	private String user_reg_name;
	private String reg_pwd;
	private String re_reg_pwd;
	private String mobile;
	private String email;
	public int getUser_reg_id() {
		return user_reg_id;
	}
	public void setUser_reg_id(int user_reg_id) {
		this.user_reg_id = user_reg_id;
	}
	public String getUser_reg_name() {
		return user_reg_name;
	}
	public void setUser_reg_name(String user_reg_name) {
		this.user_reg_name = user_reg_name;
	}
	public String getReg_pwd() {
		return reg_pwd;
	}
	public void setReg_pwd(String reg_pwd) {
		this.reg_pwd = reg_pwd;
	}
	public String getRe_reg_pwd() {
		return re_reg_pwd;
	}
	public void setRe_reg_pwd(String re_reg_pwd) {
		this.re_reg_pwd = re_reg_pwd;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "UserRegister [user_reg_id=" + user_reg_id + ", user_reg_name=" + user_reg_name + ", reg_pwd=" + reg_pwd
				+ ", re_reg_pwd=" + re_reg_pwd + ", mobile=" + mobile + ", email=" + email + "]";
	}
}
