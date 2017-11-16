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
		 * ����Ļع����������ж��������Ҫ��ɣ���ĳ�����������ȫ������ʧ�ܲ�δ�����κα仯
		 * ���������Ļع�����
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
