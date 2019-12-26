package com.you.iserverweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @program: iserver
 * @description: description
 * @author: youyi
 * @create: 2019-12-26 11:08
 **/
@Controller
public class PageController {
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String index(Model model){
        model.addAttribute("name","游移");
        model.addAttribute("level",1);
        return "index";
    }
    @GetMapping("/{page}")
    public String showPage(@PathVariable String page){
        return page;
    }
}
