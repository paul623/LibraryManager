package com.paul.javaweb.book.mapper;

import com.paul.javaweb.book.entity.ReaderCard;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface ReaderCardMapper {
    @Select("select count(*) from reader_card where reader_id = #{readerId} and passwd = #{passwd} ")
    public int getMatchCount(int readerId,String passwd);
    @Select("select reader_id, name, passwd, card_state from reader_card where reader_id = #{userId} ")
    public ReaderCard findReaderByReaderId(int userId);
    @Update("UPDATE reader_card set passwd = #{newPasswd} where reader_id = #{readerId} ")
    public int rePassword(int readerId,String newPasswd);
    @Insert("INSERT INTO reader_card (reader_id,name,passwd) values ( #{readerId} , #{name},#{password})")
    public int addReaderCard(String name,int readerId,String password);
    @Update("UPDATE reader_card set name = #{name} where reader_id = #{readerId}")
    public int updateName(int readerId,String name);
}
