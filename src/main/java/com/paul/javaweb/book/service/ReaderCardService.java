package com.paul.javaweb.book.service;

import com.paul.javaweb.book.entity.ReaderInfo;
import com.paul.javaweb.book.mapper.ReaderCardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReaderCardService {
    @Autowired
    ReaderCardMapper readerCardMapper;

    public boolean addReaderCard(ReaderInfo readerInfo){
        String name=readerInfo.getName();
        int readerId=readerInfo.getReaderId();
        return  readerCardMapper.addReaderCard(name,readerId,"111111")>0;
    }
    public boolean updatePasswd(int readerId,String passwd){
        return readerCardMapper.rePassword(readerId,passwd)>0;
    }
    public boolean updateName(int readerId,String name){
        return readerCardMapper.updateName(readerId,name)>0;
    }
}
