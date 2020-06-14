package com.paul.javaweb.book.mapper;

import com.paul.javaweb.book.entity.CardType;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import javax.smartcardio.Card;
import java.util.List;

@Mapper
public interface CardTypeMapper {
    @Select("select * from card_type where class_state = #{class_state}")
    public CardType getCardTypeByClassState(int class_state);
    @Select("select * from card_type")
    public List<CardType> getAll();
    @Select("SELECT * from card_type where class_state=(SELECT card_state from reader_card where reader_id = #{readerID})")
    public CardType getCardTypeByReaderID(int readerID);
}
