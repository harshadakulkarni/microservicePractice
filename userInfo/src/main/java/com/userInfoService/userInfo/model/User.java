package com.userInfoService.userInfo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="USERTable")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {

	@Id  
	@Column  
	private int userid;  
	@Column  
	private String username;  
	@Column  
	private String password;  
	@Column  
	private int phonenumber;
	public int getUserid() {
		// TODO Auto-generated method stub
		return userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	
}
