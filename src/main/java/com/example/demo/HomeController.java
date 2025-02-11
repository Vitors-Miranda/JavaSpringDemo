package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.Model;


@Controller
public class HomeController {
    @RequestMapping(value = "/", method=RequestMethod.GET)
    public String home(Model model) {
        model.addAttribute("mensaje", "Acceso a la URL raiz");
        return "HOME";
    }
    
}
