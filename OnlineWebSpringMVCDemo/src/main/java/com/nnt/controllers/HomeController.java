/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nnt.controllers;

import com.nnt.pojo.User;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

//    //Begin demo with addTribute
//    @RequestMapping("/")
//    public String index(Model model) {
//        model.addAttribute("name", "Nhat Truong");
//        return "index";
//    }
//    //End demo with addTribute
    
    
    
    
    
//    //Begin demo @Requestparam don't use Map<String, String>
//    @RequestMapping("/")
//    public String index2(Model model,
//            @RequestParam(value = "firstName", required = false, defaultValue = "") String firstName,
//            @RequestParam(value = "lastName", required = false, defaultValue = "") String lastName) {
//        model.addAttribute("name", String.format("%s %s", lastName, firstName));
//        return "index";
//    }
//    //End demo @Requestparam don't use Map<String, String>
    
    
    
    
    
    //Begin demo @RequestParam with use Map<String, String>
    @RequestMapping("/")
    public String index3(Model model, @RequestParam Map<String, String> params) {
        String lastName = params.get("lastName");
        String firstName = params.get("firstName");
        if (lastName == null || lastName.isEmpty() || firstName == null || firstName.isEmpty()) {
            model.addAttribute("name", "GUYS!");
        } else {
            model.addAttribute("name", String.format("%s %s", lastName, firstName));
        }
        model.addAttribute("user", new User());
        return "index";
    }
    //End demo @RequestParam with use Map<String, String>

    @RequestMapping(path = "/hello-post", method = RequestMethod.POST)
    public String show(Model model, @ModelAttribute(value = "user") User user) {
        model.addAttribute("fullName", user.getLastName() + " " + user.getFirstName());
        return "index";
    }
}
