package com.ckcj.Dao;

import com.ckcj.mapper.TblUserMapper;
import sun.security.tools.keytool.Resources;

public class MybatisDbHelper {

    private static Object SqlSession;

    //得到连接方法
    public static SqlSession getSession(){
        try{
            //1.创建一个连接工厂的构建器
            SqlSessionFactoryBuilder sfb=new SqlSessionFactoryBuilder();
            //2.拿到工厂实例
            String fpath="mybati-config.xml";
            //  SqlSessionFactory sf=sfb.build(new FileInputStream(new File(fpath)));
            //  SqlSessionFactory sf=sfb.build(Resources.getResourceAsStream(fpath));
            //3.由工厂的实例获得一个链接
            SqlSessionFactory sf = null;
            SqlSession=sf.openSession();
            boolean sqlSession = false;
            System.out.println(sqlSession);
        }catch（Exception e）{
            e.printStackTrace();
        }
        SqlSession sqlSession;
        return sqlSession;
    }

    private class SqlSessionFactoryBuilder extends sqlSessionFactoryBuilder {
    }

    private class SqlSession<TblUserMapper> {
        public TblUserMapper getMapper(Class<TblUserMapper> tblUserMapperClass) {
        }
    }
        public void close() {
        }
    }

    private class SqlSessionFactory {
        public Object openSession() {
        }
    }

    private class Resources {
    }

    private class sqlSessionFactoryBuilder {
    }
}

    public void closeSession(SqlSession sqlSession, boolean Sqlsession) {
        try {
            if (sqlSession != null) {
                sqlSession.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[]args){
         MybatisDbHelper.getSession();
    }
}