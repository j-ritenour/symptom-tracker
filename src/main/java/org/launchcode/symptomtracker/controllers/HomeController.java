package org.launchcode.symptomtracker.controllers;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class HomeController {


    @RequestMapping("")
    public String home(Model model) {

        model.addAttribute("title", "Welcome!");

        return "home";
    }






}
