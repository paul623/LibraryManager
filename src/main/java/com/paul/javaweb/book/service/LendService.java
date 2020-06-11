package com.paul.javaweb.book.service;


import com.paul.javaweb.book.entity.Lend;
import com.paul.javaweb.book.mapper.LendMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class LendService {
    @Autowired
    LendMapper lendMapper;
    public boolean bookReturn(long bookId){
        return lendMapper.bookReturnOne(new Date(),bookId)>0 && lendMapper.bookReturnTwo(bookId)>0;
    }

    public boolean bookLend(long bookId,int readerId){
        return lendMapper.bookLendOne(bookId,readerId,new Date())>0 && lendMapper.bookLendTwo(bookId)>0;
    }

    public List<Lend> lendList(){
        return lendMapper.lendList();
    }
    public List<Lend> myLendList(int readerId){
        return lendMapper.myLendList(readerId);
    }
}
