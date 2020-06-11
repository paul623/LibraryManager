package com.paul.javaweb.book.mapper;

import com.paul.javaweb.book.entity.Lend;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.Date;
import java.util.List;

@Mapper
public interface LendMapper {
    @Update("UPDATE lend_list SET back_date = #{date} WHERE book_id = #{bookId} AND back_date is NULL")
    public int bookReturnOne(Date date, long bookId);
    @Update("UPDATE book_info SET state = 1 WHERE book_id = #{bookId}")
    public int bookReturnTwo(long bookId);
    @Insert("INSERT INTO lend_list (book_id,reader_id,lend_date) VALUES ( #{bookId} , #{readerId} , #{date} )")
    public int bookLendOne(long bookId,int readerId,Date date);
    @Update("UPDATE book_info SET state = 0 WHERE book_id = #{bookId} ")
    public int bookLendTwo(long bookId);
    @Select("SELECT * FROM lend_list")
    public List<Lend> lendList();
    @Select("SELECT * FROM lend_list WHERE reader_id = #{readerId}")
    public List<Lend> myLendList(int readerId);
}
