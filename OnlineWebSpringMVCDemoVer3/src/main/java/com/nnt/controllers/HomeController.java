/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nnt.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
//    @RequestMapping(value = "/hello")
//    public String hello(Model model){
//        return "hello";
//    }
//    @RequestMapping(value = "/index")
//    public String hello2(Model model){
//        model.addAttribute("message", "Welcome to our website!!!");
//        return "forward:/hello";
//   }
    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("name", "oiiiooi");
        return "index";
    }
}
