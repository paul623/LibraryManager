package com.paul.javaweb.book.service;

import com.paul.javaweb.book.entity.CardType;
import com.paul.javaweb.book.entity.ReaderCard;
import com.paul.javaweb.book.mapper.CardTypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardTypeService {
    @Autowired
    CardTypeMapper cardTypeMapper;

    public CardType getCardType(ReaderCard readerCard){
        return cardTypeMapper.getCardTypeByClassState(readerCard.getCardState());
    }
    public List<CardType> getAll(){
        return cardTypeMapper.getAll();
    }
    public CardType getCardType(int reader_id){
        return cardTypeMapper.getCardTypeByReaderID(reader_id);
    }
}
