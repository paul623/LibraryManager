package com.paul.javaweb.book.service;

import com.paul.javaweb.book.entity.ClassInfo;
import com.paul.javaweb.book.mapper.ClassInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassInfoService {
    @Autowired
    ClassInfoMapper classInfoMapper;

    public List<ClassInfo> getAll(){
        return classInfoMapper.getAllClassInfo();
    }
}
