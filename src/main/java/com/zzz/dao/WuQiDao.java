package com.zzz.dao;

import com.zzz.pojo.WuQi;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface WuQiDao {

    //查询武器表
    List<WuQi> getAllWq();

}
