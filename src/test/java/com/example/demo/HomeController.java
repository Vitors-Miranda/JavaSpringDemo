package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import org.springframework.ui.Model;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



@Controller
public class HomeController {
    @RequestMapping(value="/", method=RequestMethod.GET)
    public String home() {
        return "home";
    }   
    
    @RequestMapping(value="/datos")
    public String login(HttpServletRequest req, Model model, HttpServletResponse res) {
        String correo = req.getParameter("correo");
        String usuario = req.getParameter("usuario");
        
        Cookie cookie = new Cookie("usuario", usuario);
        cookie.setPath("/");
        res.addCookie(cookie);
        model.addAttribute("correo", correo);
        model.addAttribute("usuario", usuario);
        return "datos";
    }
    
}
