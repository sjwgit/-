package com.neusoft.inter;

import java.util.List;

import com.neusoft.model.Goods;
import com.neusoft.model.UserInfo;

public interface ManageInter {
   public int update(String username,long pass);
   //����һ����Ʒ��Ϣ����
   public void insert(Goods goods);
   public void delete();
   // ɾ��һ���û���Ϣ
   public int delete(long id, String name);
   //ɾ��һ����Ʒ��Ϣ
   public int deleteGoods(long id, String name);
   public List<UserInfo>  select();
   //��ѯ��Ʒ
   public String select(Goods goods);
   //����ȫ����Ʒ
   public List<Goods> goodsFind();
}
