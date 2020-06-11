package com.paul.java.paul.service;

import com.paul.java.paul.entity.ReaderCard;
import com.paul.java.paul.entity.ReaderInfo;
import com.paul.java.paul.mapper.AdminMapper;
import com.paul.java.paul.mapper.ReaderCardMapper;
import com.paul.java.paul.mapper.ReaderInfoMapper;
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
