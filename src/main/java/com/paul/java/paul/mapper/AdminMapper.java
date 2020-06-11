package com.paul.java.paul.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface AdminMapper {
    @Select("SELECT COUNT(*) FROM admin where admin_id = #{adminId} and password = #{password} ")
    public int getMatchCount(int adminId,String password);
    @Update("UPDATE admin set password = #{adminId} where admin_id = #{newPasswd} ")
    public int rePassword(int adminId,String newPasswd);
    @Select("SELECT password from admin where admin_id = #{id}")
    public String getPasswd(int id);
}
