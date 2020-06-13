package com.paul.javaweb.book.mapper;

import com.paul.javaweb.book.entity.ClassInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ClassInfoMapper {
    @Select("select * from class_info")
    public List<ClassInfo> getAllClassInfo();
}
