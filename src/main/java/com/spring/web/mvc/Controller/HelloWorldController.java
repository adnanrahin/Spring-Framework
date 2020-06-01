package com.spring.web.mvc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloWorldController {

    // need a controller method to show the initial HTML form

    @RequestMapping("/showForm")
    public String showForm() {
        return "helloworld-form";
    }

    // need a controller method to process the HTML form

    @RequestMapping("/processForm")
    public String processForm() {
        return "helloworld";
    }

    @RequestMapping("/processFormVersionTwo")
    public String readFormData(HttpServletRequest request, Model model) {


        String name = request.getParameter("studentName");

        name = "Map: Whats Up " + name.toUpperCase();

        model.addAttribute("message", name);

        return "helloworld";

    }

    @RequestMapping("/processFormVersionThree")
    public String processFormVersionThree(@RequestParam("studentName") String name, Model model) {

        name = "Map: Whats Up " + name.toUpperCase();

        model.addAttribute("message", name);

        return "helloworld";

    }

}
