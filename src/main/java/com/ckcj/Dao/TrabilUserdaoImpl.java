package com.ckcj.Dao;

import com.ckcj.Entity.Tbluser;
import com.ckcj.mapper.MybatisDbHelper;

import java.awt.*;

public abstract class TrabilUserdaoImpl<SqlSession, flag, list> implements TblUserdao{
    @Override
    public boolean addTbluser(Tbluser tbluser) {
        boolean flag=false;
        try {
            //1.得到链接
            com.ckcj.Dao.MybatisDbHelper<Object> mybatisDbhelper = null;
            SqlSession sqlSession = (SqlSession) mybatisDbhelper.getSession();
            //2.SQL
            Object s;
            sqlSession.(s:"addTblUser", tbluser);
            //3.提交
            sqlSession.comminsert();
            boolean num;
            System.out.println(num);
            boolean ture;
            flag = ture;
            boolean num;
            System.out.println(num);
        } catch(Exception.e) {
              flag = false;
              }
        e.printStackTrace();
        }
        return flag;

    @Override
     public boolean delTblUser(String upwd, String uid) {

    }

    public List updateTblUser(String upwd, String userid, Object TbluserList){
        public List findTblUser(){
             List tbluserList=null;
            try {
                SqlSession sqlSession = (SqlSession) MybatisDbHelper.getSession();
                Object s;
                TbluserList=sqlSession.selectList(s:"findTbluser");
            }  catch (Exception e) {
                e.printStackTrace();
            }
               return tbluserList;
        }
     }
}
