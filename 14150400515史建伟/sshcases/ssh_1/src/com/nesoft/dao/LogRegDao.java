package com.nesoft.dao;
import com.neusoft.inter.LogandReg;
import com.neusoft.model.Admin;
import com.neusoft.model.User;
import com.neusoft.model.UserInfo;
public class LogRegDao extends BaseDao implements LogandReg{
	@Override
	public Admin login(String username,long password) {
		// TODO Auto-generated method stub
		 String sql = " FROM Admin WHERE name=? AND password=? ";		 
		  Admin admin =(Admin) getSession().createQuery(sql).setString(0, username).setLong(1, password).uniqueResult();
		   System.out.println(admin);
		  return admin;
	}
	@Override
	public void  register(UserInfo userInfo,User user) {
		// TODO Auto-generated method stub
		/*getSession().beginTransaction().rollback();
		 * 事物的回滚操作，当有多个步骤需要完成，若某个步骤出错，则全部操作失败并未发生任何变化
		 * 许调用事物的回滚操作
		 * */
		 try {
			 getSession().saveOrUpdate(userInfo);
		      getSession().saveOrUpdate(user);
		} catch (Exception e){
			// TODO: handle exception
			getSession().beginTransaction().rollback();
		}
	     
	      
		 
	}

	
}
