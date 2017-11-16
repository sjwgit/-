package com.neusoft.model;

import java.io.Serializable;

public class User implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
    private String username;
    private long password;
    private int quan;
	public User(Integer id, String username, long password, int quan) {
		super();
		this.id = id;
		this.username = username;
		this.password=password;
		this.quan = quan;
	}
	public User() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public long getPassword() {
		return password;
	}
	public void setPassword(long password) {
		this.password=password;
	}
	public int getQuan() {
		return quan;
	}
	public void setQuan(int quan) {
		this.quan = quan;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password+ ", quan=" + quan + "]";
	}
    
}
