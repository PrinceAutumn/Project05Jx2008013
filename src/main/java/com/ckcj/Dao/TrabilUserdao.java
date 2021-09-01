package com.ckcj.Dao;

import com.ckcj.Entity.Tbluser;

import java.awt.*;

public interface TrabilUserdao {
    //1.增加用户
    public boolean addTbluser(Tbluser tbluser);
    //2.删除用户
    public boolean delTblUser(String uid);
    //3.重置用户密码
    public boolean udpateTblUser();
    // 传参用 注解param
    public boolean updateTblUser(String upwd,String userid);
    //4.查询所有用户列表 根据用户模糊查找分页
    public <Trabiluser> List  findTrabiluser(String uname, int pageNo);

    public class Trabiluser {
    }
}
