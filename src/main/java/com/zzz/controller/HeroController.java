package com.zzz.controller;

import com.zzz.pojo.Hero;
import com.zzz.pojo.User;
import com.zzz.pojo.WuQi;
import com.zzz.service.impl.HeroServiceImpl;
import com.zzz.service.impl.UserServiceImpl;
import com.zzz.service.impl.WuQiServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class HeroController {

    int a=0;

    @Autowired
    HeroServiceImpl heroService;
    @Autowired
    WuQiServiceImpl wuQiService;

    //英雄列表
    @RequestMapping("/heroes")
    //@ResponseBody
    public String heroes(Model model){
        List<Hero> heroes = heroService.queryHero();
        model.addAttribute("heroes",heroes);
        return "hero";
    }

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/add")
    public String add(){
        return "add";
    }

    //删除
    @GetMapping("/delhero/{id}")
    public String delHero(@PathVariable("id")Integer id){
        heroService.delHero(id);
        return "redirect:/heroes";
    }

    //编辑
    @GetMapping("/hero/{id}")
    public String hero(@PathVariable("id")Integer id, Model model, HttpSession session){
        List<Hero> hes = heroService.queryHeroById(id);
        a = id;
        model.addAttribute("hes",hes);
        return "update";
    }

    //更新数据
    @GetMapping("/updatehero")
    public String updateHero(String cnName, String enName,
                             String alias, Integer sex,
                             String price, String gps,
                             String place){
        heroService.updateHero(cnName,enName,alias,sex,price,gps,place,a);
        return "redirect:/heroes";
    }

    //添加英雄
    @RequestMapping("/addUser")
    public String addUser(String cnName, String enName,
                          String alias, Integer sex,
                          String price, String gps,
                          String place){
        heroService.addHero(cnName,enName,alias,sex,price,gps,place);
        return "redirect:/heroes";
    }

    //武器列表
    @RequestMapping("/wuqis")
    //@ResponseBody
    public String wuQi(Model model){
        List<WuQi> allWq = wuQiService.getAllWq();
        model.addAttribute("ws",allWq);
        return "wuqi";
    }

    //搜索
    @RequestMapping("/search")
    public String search(String search,Model model){
        if(search.equals("首页")){
            return "redirect:/index";
        }else if(search.contains("英雄")){
            return "redirect:/heroes";
        }else if(search.contains("武器")){
            return "redirect:/wuqis";
        }else{
            return "404";
        }
    }

}

