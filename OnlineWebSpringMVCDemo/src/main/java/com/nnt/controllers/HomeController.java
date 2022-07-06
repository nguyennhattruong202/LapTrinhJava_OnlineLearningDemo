/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nnt.controllers;

import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
//    //Begin demo @requestParam use Map<String, String>
//    @RequestMapping("/")
//    public String index(Model model,
//            @RequestParam Map<String, String> params) {
//        String firstName = params.get("first_name");
//        String lastName = params.get("last_name");
//        if (firstName != null && lastName != null) {
//            model.addAttribute("name",
//                    String.format("%s %s", lastName, firstName));
//        } else {
//            model.addAttribute("name", "YOU!");
//        }
//        return "index";
//    }
//    //End demo @requestParam use Map<String, String>
    
    
    
    
    
//    //Begin demo @RequestParam dont use Map<String, String>
//    @RequestMapping("/")
//    public String index(Model model,
//            @RequestParam(value = "first_name", required = false, defaultValue = "A") String firstName,
//            @RequestParam(value = "last_name", required = false, defaultValue = "B") String lastName) {
//        if (firstName != null && lastName != null) {
//            model.addAttribute("name",
//                    String.format("%s %s", lastName, firstName));
//        } else {
//            model.addAttribute("name", "YOU!");
//        }
//        return "index";
//    }
//    //End demo @RequestParam dont use Map<String, String>

    
    
    
    
//    //Begin demo with addAttribute
//    @RequestMapping("/")
//    public String index(Model model) {
//        model.addAttribute("name", "Nhat Truong123");
//        return "index";
//    }
//    //End demo with addAttribute

    
    
    
    
//    //Begin demo with @PathVariable
//    @RequestMapping("/hello/{name}")
//    public String hello(Model model, @PathVariable(value = "name") String name) {
//        model.addAttribute("message", "Welcome " + name + " !!!!!");
//        return "hello";
//    }
//    //End demo with @PathVariable
}
