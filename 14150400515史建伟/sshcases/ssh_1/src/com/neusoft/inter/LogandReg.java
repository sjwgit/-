package com.neusoft.inter;

import com.neusoft.model.Admin;
import com.neusoft.model.User;
import com.neusoft.model.UserInfo;

public interface LogandReg {
  public  Admin login(String username,long password);
  public void register(UserInfo userInfo, User user);
}
