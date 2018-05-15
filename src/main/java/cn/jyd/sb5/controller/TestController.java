package cn.jyd.sb5.controller;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2018/5/14.
 */
@Controller
public class TestController {

    @GetMapping(value="/getMsg")
    @ResponseBody
    public String getMsg(){
        return "test";
    }
//    @GetMapping(value="/")
//    @ResponseBody
//    public String index(){
//        return "test";
//    }
}
