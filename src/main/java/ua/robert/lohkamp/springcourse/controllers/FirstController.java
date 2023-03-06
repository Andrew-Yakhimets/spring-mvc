package ua.robert.lohkamp.springcourse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class FirstController {
    @GetMapping("/hello")
    public String helloPage(@RequestParam Map<String, String> params) {
//        String name = request.getParameter("name");
        System.out.println("Hello, " + params);
        System.out.println("Hello, " + params.get("name"));

        return "first/hello";
    }

    @GetMapping("/hello2")
    public String helloPage2(@RequestParam("name") String name) {
//        String name = request.getParameter("name");
        System.out.println("Hello, " + name);

        return "first/hello";
    }

    @GetMapping("/hello3")
    public String helloPage3(@RequestParam(value = "name", required = false) String name) {
//        String name = request.getParameter("name");
        System.out.println("Hello, " + name);

        return "first/hello";
    }


    @GetMapping("/goodbye")
    public String goodByePage() {
        return "first/goodbye";
    }
}
