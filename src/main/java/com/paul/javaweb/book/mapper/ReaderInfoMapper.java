package com.paul.javaweb.book.mapper;

import com.paul.javaweb.book.entity.ReaderInfo;
import org.apache.ibatis.annotations.*;


import java.util.Date;
import java.util.List;

@Mapper
public interface ReaderInfoMapper {
    @Select("SELECT * FROM reader_info")
    public List<ReaderInfo> getAllReaderInfo();
    @Select("SELECT * FROM reader_info where reader_id = #{readerId} ")
    public ReaderInfo findReaderInfoByReaderId(int readerId);
    @Delete("DELETE FROM reader_info where reader_id = #{readerId} ")
    public int deleteReaderInfo(int readerId);
    @Update("UPDATE reader_info set name = #{name} ,sex = #{sex} ,birth = #{birth} ,address = #{address} ,telcode = #{telcode} where reader_id = #{readerId} ")
    public int editReaderInfo(String name, String sex, Date birth,String address,String telcode,int readerId);
    @Insert("INSERT INTO reader_info VALUES(#{readerId},#{name},#{sex},#{birth},#{address},#{telcode})")
    public int addReaderInfo(String name, String sex, Date birth,String address,String telcode,int readerId);
}
