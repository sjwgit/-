package com.neusoft.model;

import java.io.Serializable;

public class Student implements Serializable {
    private Integer id;
    private String name;
    private String sex;
    private String birth;
    private String address;
    private  Integer age;
	public Student() {
		super();
	}
	public Student(Integer id, String name, String sex, String birth, String address, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.birth = birth;
		this.address = address;
		this.age = age;
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", sex=" + sex + ", birth=" + birth + ", address=" + address
				+ ", age=" + age + "]";
	}
    
}
