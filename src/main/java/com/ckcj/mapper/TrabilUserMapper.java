package com.ckcj.mapper;

import com.ckcj.Entity.Tbluser;
import org.junit.runners.Parameterized;

import java.time.temporal.ValueRange;

public interface TblUserMapper {
}
























// //5.登录 根据用户和密码查询 param
  public Tbluser loginUser（@Param（value="uname")String uname,
                            @Param(Value="Upwd")String upwd);

