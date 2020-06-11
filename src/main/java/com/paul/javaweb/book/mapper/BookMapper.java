package com.paul.javaweb.book.mapper;

import com.paul.javaweb.book.entity.Book;
import org.apache.ibatis.annotations.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Mapper
public interface BookMapper {
    @Select("SELECT * FROM book_info")
    public List<Book> getAllBooks();

    @Select("SELECT * FROM book_info WHERE book_id like #{sw} or name like #{sw}")
    public List<Book> queryBook(String sw);

    @Select("SELECT count(*) FROM book_info WHERE book_id like #{searchWord}  or name like #{searchWord}  ")
    public int matchBook(String searchWord);

    @Delete("delete from book_info where book_id = #{bookId}  ")
    public int deleteBook(long bookId);

    @Insert("INSERT INTO book_info(name,author,publish,ISBN,introduction,language,price,pubdate,class_id,pressmark,state) VALUES(#{name},#{author},#{publish},#{isbn},#{introduction},#{language},#{price},#{pubdate},#{class_id},#{pressmark},#{state})")
    public int addBook(String name, String author, String publish, String isbn, String introduction, String language, BigDecimal price, Date pubdate, int class_id, int pressmark, int state);

    @Select("SELECT * FROM book_info where book_id = #{bookId}")
    public Book getBook(Long bookId);

    @Update("update book_info set name= #{name} ,author= #{author} ,publish= #{publish} ,ISBN= #{isbn} ,introduction= #{introduction} ,language= #{language} ,price= #{price} ,pubdate= #{pubdate} ,class_id= #{class_id} ,pressmark= #{pressmark} ,state= #{state}  where book_id= #{book_id} ")
    public int editBook(long book_id,String name, String author, String publish, String isbn, String introduction, String language, BigDecimal price, Date pubdate, int class_id, int pressmark, int state);

}
