package com.neusoft.model;
import java.io.Serializable;
import java.util.List;
public class UserInfo implements Serializable {
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
   private  Integer id;
   private String user_name;
   private  String name;
   private  String sex;
   private  String email;
   private String interests;
   private String city;
   private String idCard;
   private String jiguan;
   
public UserInfo() {
	super();
}
public UserInfo(Integer id, String user_name, String name, String sex, String eamil, String interests,
		String city, String idCard, String jiguan) {
	super();
	this.id = id;
	this.user_name = user_name;
	this.name = name;
	this.sex = sex;
	this.email = eamil;
	this.interests = interests;
	this.city = city;
	this.idCard = idCard;
	this.jiguan = jiguan;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getUser_name() {
	return user_name;
}
public void setUser_name(String user_name) {
	this.user_name = user_name;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public  String getSex() {
	return sex;
}
public void setSex(String sex) {
	this.sex = sex;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getInterests() {
	return interests;
}
public void setInterests(String interests) {
	this.interests = interests;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getIdCard() {
	return idCard;
}
public void setIdCard(String idCard) {
	this.idCard = idCard;
}
public String getJiguan() {
	return jiguan;
}
public void setJiguan(String jiguan) {
	this.jiguan = jiguan;
}
@Override
public String toString() {
	return "UserInfo [id=" + id + ", user_name=" + user_name + ", name=" + name + ", sex=" + sex + ", email=" + email
			+ ", interests=" + interests + ", city=" + city + ", idCard=" + idCard + ", jiguan=" + jiguan + "]";
}

   
}
