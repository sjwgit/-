package com.nesoft.service;

import org.springframework.transaction.annotation.Transactional;

import com.nesoft.dao.LogRegDao;
import com.neusoft.model.Admin;
import com.neusoft.model.User;
import com.neusoft.model.UserInfo;
@Transactional
public class LogRegService {
   private LogRegDao logRegDao;
   public void setLogRegDao(LogRegDao logRegDao) {
	this.logRegDao = logRegDao;
   }
   public Admin login(String username,long password){
	      Admin admin =  logRegDao.login(username, password);
	       return admin;
   }
   public void register(UserInfo userinfo,User user){
	        logRegDao.register(userinfo,user);
   }
}
