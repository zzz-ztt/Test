package com.zzz.service.impl;

import com.zzz.dao.HeroDao;
import com.zzz.pojo.Hero;
import com.zzz.service.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HeroServiceImpl implements HeroService {

    @Autowired
    HeroDao heroDao;

    @Override
    public List<Hero> queryHero() {
        return heroDao.queryHero();
    }

    @Override
    public int addHero(String cnName, String enName, String alias, Integer sex, String price, String gps, String place) {
        return heroDao.addHero(cnName,enName,alias,sex,price,gps,place);
    }

    @Override
    public int delHero(Integer id) {
        return heroDao.delHero(id);
    }

    @Override
    public List<Hero> queryHeroById(Integer id) {
        return heroDao.queryHeroById(id);
    }

    @Override
    public int updateHero(String cnName, String enName, String alias, Integer sex, String price, String gps, String place,Integer id) {
        return heroDao.updateHero(cnName,enName,alias,sex,price,gps,place,id);
    }
}
