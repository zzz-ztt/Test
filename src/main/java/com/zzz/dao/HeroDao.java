package com.zzz.dao;

import com.zzz.pojo.Hero;
import com.zzz.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface HeroDao {

    //查询所有
    List<Hero> queryHero();

    //添加
    int addHero(@Param("cnName")String cnName,@Param("enName")String enName,
                @Param("alias")String alias,@Param("sex")Integer sex,
                @Param("price")String price,@Param("gps")String gps,
                @Param("place")String place);

    //删除
    int delHero(@Param("id")Integer id);

    //通过id查找
    List<Hero> queryHeroById(@Param("id")Integer id);

    //修改
    int updateHero(@Param("cnName")String cnName, @Param("enName")String enName,
                    @Param("alias")String alias, @Param("sex")Integer sex,
                    @Param("price")String price, @Param("gps")String gps,
                    @Param("place")String place,@Param("id")Integer id);


}
