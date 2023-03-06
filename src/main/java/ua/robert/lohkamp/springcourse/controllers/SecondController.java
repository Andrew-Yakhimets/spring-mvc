package ua.robert.lohkamp.springcourse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecondController {
    @GetMapping("/fuck")
    public String sayFuckYou() {
        return "second/fuck";
    }
}
