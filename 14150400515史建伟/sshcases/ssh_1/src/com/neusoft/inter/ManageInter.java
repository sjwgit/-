package com.neusoft.inter;

import java.util.List;

import com.neusoft.model.Goods;
import com.neusoft.model.UserInfo;

public interface ManageInter {
   public int update(String username,long pass);
   //插入一体商品信息数据
   public void insert(Goods goods);
   public void delete();
   // 删除一条用户信息
   public int delete(long id, String name);
   //删除一条商品信息
   public int deleteGoods(long id, String name);
   public List<UserInfo>  select();
   //查询商品
   public String select(Goods goods);
   //查找全部商品
   public List<Goods> goodsFind();
}
