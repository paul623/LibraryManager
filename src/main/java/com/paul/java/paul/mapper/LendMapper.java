package com.paul.java.paul.mapper;

import com.paul.java.paul.entity.Lend;

import java.util.List;

public interface LendMapper {
    public int bookReturnOne(long bookId);
    public int bookReturnTwo(long bookId);
    public int bookLendOne(long bookId,int readerId);
    public int bookLendTwo(long bookId);
    public List<Lend> lendList();
    
}
