package org.launchcode.symptomtracker.controllers;




import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class HomeController {





    //"when we open app default to home page"
    @RequestMapping("")
    public String home(Model model) {
        model.addAttribute("title", "Welcome!");
        return "home";
    }






}
