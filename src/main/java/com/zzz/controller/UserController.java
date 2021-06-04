package com.zzz.controller;

import com.zzz.pojo.Hero;
import com.zzz.pojo.User;
import com.zzz.service.impl.HeroServiceImpl;
import com.zzz.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.Collection;

@Controller
public class UserController {

    @Autowired
    UserServiceImpl userService;

    @RequestMapping("/user/login")
    public String login(
            @RequestParam("username")String username,
            @RequestParam("password") String password,
            HttpSession session,Model model){
        String s = userService.selectUser(username);
        if(password.equals(s)){
            session.setAttribute("loginUser",username);
            return "index";
        }else{
            model.addAttribute("msg","用户名或密码错误！");
            return "login";
        }
    }

    //跳转注册页面
    @GetMapping("/user/register")
    public String register(){
        return "register";
    }

    @PostMapping("/user/register")
    public String registerSubmit(String name,String pwd,String phone){
        userService.addUser(name,pwd,phone);
        return "login";
    }

    //注销
    @RequestMapping("/user/logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "login";
    }

    //个人信息页面
    @RequestMapping("/information")
    public String informationA(Model model,HttpSession session){
        String name = (String) session.getAttribute("loginUser");
        User users = userService.getAllUser(name);
        model.addAttribute("users",users);
        return "information";
    }

    //更新用户信息页面
    @RequestMapping("/updateIn")
    public String updateInformation(String username,String name,String phone,String cardId,String sex,String address,HttpSession session){
        Integer a;
        if(sex.equals("男")){
            a=1;
        }else if (sex.equals("女")){
            a=0;
        }else {
            a=2;
        }
        userService.addUserByUser(username,name,phone,cardId,a,address,(String)session.getAttribute("loginUser"));
        return "index";
    }

}
