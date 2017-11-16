package com.neusoft.model;

import java.io.Serializable;

public class Admin implements Serializable {
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private Integer id;
 private String name;
 private Integer age;
 private String sex;
 private String address;
 private long password;
 
public Admin() {
	super();
}

public Admin(Integer id, String name, Integer age, String sex, String address, long password) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
	this.sex = sex;
	this.address = address;
	this.password = password;
}

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Integer getAge() {
	return age;
}

public void setAge(Integer age) {
	this.age = age;
}

public String getSex() {
	return sex;
}

public void setSex(String sex) {
	this.sex = sex;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public long getPassword() {
	return password;
}

public void setPassword(long password) {
	this.password = password;
}

public static long getSerialversionuid() {
	return serialVersionUID;
}

@Override
public String toString() {
	return "Admin [id=" + id + ", name=" + name + ", age=" + age + ", sex=" + sex + ", address=" + address
			+ ", password=" + password + "]";
}

}
