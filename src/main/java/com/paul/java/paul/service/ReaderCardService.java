package com.paul.java.paul.service;

import com.paul.java.paul.entity.ReaderInfo;
import com.paul.java.paul.mapper.ReaderCardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReaderCardService {
    @Autowired
    ReaderCardMapper readerCardMapper;

    public boolean addReaderCard(ReaderInfo readerInfo){
        String name=readerInfo.getName();
        int readerId=readerInfo.getReaderId();
        return  readerCardMapper.addReaderCard(name,readerId)>0;
    }
    public boolean updatePasswd(int readerId,String passwd){
        return readerCardMapper.rePassword(readerId,passwd)>0;
    }
    public boolean updateName(int readerId,String name){
        return readerCardMapper.updateName(readerId,name)>0;
    }
}
