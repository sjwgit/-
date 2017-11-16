package com.neusoft.action;
import java.util.Map;
import org.apache.struts2.interceptor.RequestAware;
import com.nesoft.service.LogRegService;
import com.neusoft.model.User;
import com.neusoft.model.UserInfo;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
public class regAction extends ActionSupport implements ModelDriven<UserInfo>,RequestAware,Preparable {
    /**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	private String interests;
	public void setInterests(String interests) {
		this.interests = interests;
	}
	public String getInterests() {
		return interests;
	}
	private Map<String, Object> requests;
	private  LogRegService logRegService;
	private int password;
	private User user;
	public void setPassword(int password) {
		this.password = password;
	}
	public int getPassword() {
		return password;
	}
	public void setLogRegService(LogRegService logRegService) {
		this.logRegService = logRegService;
	}
	
	 private UserInfo userInfo;
	 public void prepareRegister(){
		
		 System.out.println("prepareRegister++++++");
		  userInfo = new UserInfo();
	}
	public String register(){ 
		      System.out.println(interests);
		  user = new User();
		   user.setPassword(password);
		   user.setUsername(userInfo.getUser_name());
		   user.setQuan(1);
		    logRegService.register(userInfo, user);
		  return SUCCESS;
	}
    @Override
	public void setRequest(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		 this.requests=arg0;
	}
     
	@Override
	public UserInfo getModel() {
		System.out.println("getModel()+++++");
		return userInfo;
	}

	@Override
	public void prepare() throws Exception {
		// TODO Auto-generated method stub
		
	}

}
