/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.blog.m66.controllers;

/**
 *
 * @author Bence
 */
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller


public class HomeController {
   String c = "this is  the blog content place ";
   
    @RequestMapping("/")
    public String index() {
       		
  
      
        return "index";
    
}
   
    

}
