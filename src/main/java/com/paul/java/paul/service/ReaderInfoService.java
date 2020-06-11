package com.paul.java.paul.service;

import com.paul.java.paul.entity.ReaderInfo;
import com.paul.java.paul.mapper.ReaderInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ReaderInfoService {
    @Autowired
    ReaderInfoMapper readerInfoMapper;
    public List<ReaderInfo> readerInfos(){
        return readerInfoMapper.getAllReaderInfo();
    }

    public boolean deleteReaderInfo(int readerId){
        return readerInfoMapper.deleteReaderInfo(readerId)>0;
    }

    public ReaderInfo getReaderInfo(int readerId){
        return readerInfoMapper.findReaderInfoByReaderId(readerId);
    }
    public boolean editReaderInfo(ReaderInfo readerInfo){
        String address=readerInfo.getAddress();
        Date birth=readerInfo.getBirth();
        String name=readerInfo.getName();
        int readerId=readerInfo.getReaderId();
        String sex=readerInfo.getSex();
        String telcode=readerInfo.getTelcode();
        return readerInfoMapper.editReaderInfo(address,sex,birth,address,telcode,readerId)>0;
    }
    public boolean addReaderInfo(ReaderInfo readerInfo){
        String address=readerInfo.getAddress();
        Date birth=readerInfo.getBirth();
        String name=readerInfo.getName();
        String sex=readerInfo.getSex();
        String telcode=readerInfo.getTelcode();
        int readerId=readerInfo.getReaderId();
        return  readerInfoMapper.addReaderInfo(name,sex,birth,address,telcode,readerId)>0;
    }
}
