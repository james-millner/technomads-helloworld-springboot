package com.helloworld.controller;

import com.helloworld.model.HelloWorldObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping(value = "/view")
    public String helloExample() {
        return "HelloWorld";
    }

    @GetMapping(value = "/view-with-object")
    public String helloExampleWithObject(Model model) {

        final HelloWorldObject helloWorldObject = new HelloWorldObject();
        helloWorldObject.setText("Hi Tech Nomads");

        model.addAttribute("testObject", helloWorldObject);
        return "HelloWorld";
    }
}
