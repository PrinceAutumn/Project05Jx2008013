package com.ckcj.Tools;

import org.junit.Test;

public class TestTblUserDao {
    //测试方法定义：void 方法名test 前缀
    @Test
    public void testDelTblUser(){
        boolean f=tbluserdao.delTbluser(uid:"2");
        System.out.println(f);
    }
}
publlic void testAddTblUser(){
    Tblluser tbluser = new  Tbluser();
    tbluser.setPhone("234567890");
        tblUser.setMoney(300);
        tblUser.setUname（"CCQED")
        tblUser.setUpwd("123456")
        tblUser.setRid(1);
        boolean f= tbluserDao.addTblUser(tbluser);


        }
        }