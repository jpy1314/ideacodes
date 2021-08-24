package cn.baizhi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
@RequestMapping("test")
public class caiController {
    @RequestMapping("cai")
    @ResponseBody
    public String cai(){
    return "菜团子";
    }
}
