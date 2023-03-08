package ua.robert.lohkamp.springcourse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class FirstController {

    @GetMapping("/hello")
    public String helloPage2(@RequestParam(value = "name", required = false)  String name, Model model) {
        model.addAttribute("message", "Hello, " + name);

        return "first/hello";
    }

    @GetMapping("/calculator")
    public String calculatorPage(@RequestParam(value = "a", required = false) Integer a,
                                 @RequestParam(value = "b", required = false) Integer b,
                                 @RequestParam(value = "operation", required = false) String operation,
                                 Model model) {
        int numberA = a;
        int numberB = b;
        int result = switch (operation) {
            case "+" -> numberA + numberB;
            case "-" -> numberA - numberB;
            case "*" -> numberA * numberB;
            case "/" -> numberA / numberB;
            default -> 220;
        };
        String message = a + operation + b + " = " + result;
        model.addAttribute("mesage", message);
        return "first/calculator";
    }

    @GetMapping("/goodbye")
    public String goodByePage() {
        return "first/goodbye";
    }
}
