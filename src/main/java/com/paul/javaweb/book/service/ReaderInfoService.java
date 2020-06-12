package com.paul.javaweb.book.service;

import com.paul.javaweb.book.entity.ReaderInfo;
import com.paul.javaweb.book.mapper.ReaderInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        return readerInfoMapper.editReaderInfo(name,sex,birth,address,telcode,readerId)>0;
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
