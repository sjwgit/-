package com.nesoft.dao;

import java.io.File;
import java.util.List;

import com.neusoft.inter.ManageInter;
import com.neusoft.model.Goods;
import com.neusoft.model.UserInfo;

public class ManageDao extends BaseDao implements ManageInter {
   
	@Override
	public int update(String username, long pass) {
		// TODO Auto-generated method stub
		 String sql = "update admin set password=? where name=?";
		return  getSession().createSQLQuery(sql).setLong(0, pass).setString(1,username).executeUpdate();
	    
	}

	@Override
	public void insert(Goods goods) {
         
         
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub

	}
   
	@Override
	public List<UserInfo> select() {
		// TODO Auto-generated method stub
        String hql= " from UserInfo";
        return (List<UserInfo>) getSession().createQuery(hql).list();
	}

	@Override
	public int delete(long id, String name) {
		// TODO Auto-generated method stub
		
		 String sql="delete  from UserInfo where id=?";
		 return (int) getSession().createQuery(sql).setLong(0,id).executeUpdate();
	}

	@Override
	public String select(Goods goods) {
		// TODO Auto-generated method stub
		
		 // goods必要信息存放到数据库。
		String hql="from Goods where upImgFileName=?";
	     String name = goods.getUpImgFileName();
		 Object obj =   getSession().createQuery(hql).setString(0,name).uniqueResult();
		 if( obj == null){
			  getSession().saveOrUpdate(goods);
			  return "success";
		  }else{
			  String sql = "update goods set nums=nums+?";
			   int  res = getSession().createSQLQuery(sql).setInteger(0, goods.getNums()).executeUpdate();
		       
		  }
		return "success";
		
	}

	@Override
	public List<Goods> goodsFind() {
		// TODO Auto-generated method stub;
		List<Goods> goods;
		String sql = "from Goods";
		return goods = getSession().createQuery(sql).list();
		
	}

	@Override
	public int deleteGoods(long id, String name) {
		String sql = "delete from Goods where id=?";
		return getSession().createQuery(sql).setLong(0, id).executeUpdate();
	}

}
