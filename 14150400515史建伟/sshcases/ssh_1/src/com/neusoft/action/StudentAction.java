package com.neusoft.action;
import java.util.Map;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;
import com.nesoft.service.LogRegService;
import com.nesoft.service.ManageService;
import com.neusoft.model.Admin;
import com.neusoft.model.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
public class StudentAction extends ActionSupport implements ModelDriven<Admin>,Preparable,RequestAware,SessionAware{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String username;
	private long pw;
	private Map<String, Object> request;
	private Map<String, Object> session;
	private LogRegService logRegService;
	private ManageService manageService;
	public void setManageService(ManageService manageService) {
		this.manageService = manageService;
	}
	public void setLogRegService(LogRegService logRegService) {
		this.logRegService = logRegService;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUsername() {
		return username;
	}
	public void setPw(long pw) {
		this.pw = pw;
	}
	public long getPw() {
		return pw;
	}
	private Admin admin;
	public void prepareLogin(){
		admin = new Admin();
	}
   public String login(){
	   String name = admin.getName();
	   long password = admin.getPassword();
	    request.put("admin", admin);
	    session.put("admin", admin);
	    System.out.println(admin);
        Admin admin=  logRegService.login(name,password);
        if(admin == null){
        	return INPUT;
        }else{
        	return "login"; 
        }
   }
   public void prepareUpdate(){
	    admin = new Admin();
   }
   public String update(){
	   String username= (String) request.get("username");
	    long newPw = (long) request.get("password");
	    System.out.println(username+"-----------"+newPw);
	     int result = manageService.update(username, newPw);
	    if(result == 1){
	    	return "update";
	    }else{
	    	return INPUT;
	    }
	       
	   
   }
@Override
public Admin getModel() {
	// TODO Auto-generated method stub
	return admin;
}
@Override
public void setRequest(Map<String, Object> arg0) {
	// TODO Auto-generated method stub
	this.request = arg0;
}
@Override
public void prepare() throws Exception {
	// TODO Auto-generated method stub
}
@Override
public void setSession(Map<String, Object> arg0) {
	// TODO Auto-generated method stub
	this.session=arg0;
}
}
