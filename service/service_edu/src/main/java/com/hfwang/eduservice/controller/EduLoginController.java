package com.hfwang.eduservice.controller;


import com.hfwang.commonutils.R;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/eduservice/user")
@CrossOrigin
public class EduLoginController {

    // login
    @PostMapping("login")
    public R login(){
        return R.ok().data("token","admin");
    }


    // info
    @PostMapping("info")
    public R info(){
        return R.ok().data("name","admin").data("avatar","https://fuss10.elemecdn.com/e/5d/4a731a90594a4af544c0c25941171jpeg.jpeg");
    }
}
