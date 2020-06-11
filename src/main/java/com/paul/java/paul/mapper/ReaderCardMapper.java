package com.paul.java.paul.mapper;

import com.paul.java.paul.entity.ReaderCard;
import com.paul.java.paul.entity.ReaderInfo;
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
    @Update("UPDATE reader_card set passwd = #{readerId} where reader_id = #{newPasswd} ")
    public int rePassword(int readerId,String newPasswd);
    @Insert("INSERT INTO reader_card (reader_id,name) values ( #{readerId} , #{name})")
    public int addReaderCard(String name,int readerId);
    @Update("UPDATE reader_card set name = #{name} where reader_id = #{readerId}")
    public int updateName(int readerId,String name);
}
