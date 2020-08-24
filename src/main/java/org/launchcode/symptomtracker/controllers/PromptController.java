package org.launchcode.symptomtracker.controllers;

import org.launchcode.symptomtracker.models.Prompt;
import org.launchcode.symptomtracker.models.data.PromptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("prompt")
public class PromptController {

        //linking up PromptRepository(where prompt data is stored)
        @Autowired
        public PromptRepository promptRepository;

    @GetMapping("add")
    public String displayPrompt(Model model) {
        model.addAttribute(new Prompt());
        return "prompt/add";
    }

    @PostMapping("add")
    public String processPrompt(@ModelAttribute @Valid Prompt newPrompt,
                                       Errors errors, Model model) {

        if (errors.hasErrors()) {
            return "prompt/add";
        }
        promptRepository.save(newPrompt);
        return "home";
    }



    }

