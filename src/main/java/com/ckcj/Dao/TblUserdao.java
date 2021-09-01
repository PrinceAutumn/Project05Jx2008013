package com.ckcj.Dao;

import com.ckcj.Entity.Tbluser;

import java.util.List;

public interface TblUserdao {
    //1.增加用户
    public boolean addTbluser(Tbluser tbluser);
    //2.删除用户
    public boolean delTblUser(String uid);
    //3.重置用户密码
    public boolean udpateTblUser();

   boolean delTblUser(String upwd, String userid);

   // 传参用 注解param
    public java.awt.List updateTblUser(String upwd, String userid, Object TbluserList);
    //4.查询所有用户列表 根据用户模糊查找分页
    public <Trabiluser> List<Trabiluser> findTrabiluser(String uname, int pageNo);
    public class Trabiluser {
    }
}

