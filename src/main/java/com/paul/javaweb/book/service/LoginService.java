package com.paul.javaweb.book.service;

import com.paul.javaweb.book.entity.ReaderCard;
import com.paul.javaweb.book.entity.ReaderInfo;
import com.paul.javaweb.book.mapper.AdminMapper;
import com.paul.javaweb.book.mapper.ReaderCardMapper;
import com.paul.javaweb.book.mapper.ReaderInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    @Autowired
    private ReaderCardMapper readerCardDao;
    @Autowired
    private ReaderInfoMapper readerInfoDao;
    @Autowired
    private AdminMapper adminDao;

    public boolean hasMatchReader(int readerId,String passwd){
        return  readerCardDao.getMatchCount(readerId, passwd)>0;
    }

    public ReaderCard findReaderCardByUserId(int readerId){
        return readerCardDao.findReaderByReaderId(readerId);
    }
    public ReaderInfo findReaderInfoByReaderId(int readerId){
        return readerInfoDao.findReaderInfoByReaderId(readerId);
    }

    public boolean hasMatchAdmin(int adminId,String password){
        return adminDao.getMatchCount(adminId,password)==1;
    }

    public boolean adminRePasswd(int adminId,String newPasswd){
        return adminDao.rePassword(adminId,newPasswd)>0;
    }
    public String getAdminPasswd(int id){
        return adminDao.getPasswd(id);
    }

}
