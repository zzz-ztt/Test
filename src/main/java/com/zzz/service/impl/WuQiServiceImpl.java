package com.zzz.service.impl;

import com.zzz.dao.WuQiDao;
import com.zzz.pojo.WuQi;
import com.zzz.service.WuQiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WuQiServiceImpl implements WuQiService {

    @Autowired
    WuQiDao wuQiDao;

    @Override
    public List<WuQi> getAllWq() {
        return wuQiDao.getAllWq();
    }
}
