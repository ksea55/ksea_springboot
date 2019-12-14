package org.ksea.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @ResponseBody
    @GetMapping("/hello")
    public Object hello() {
        return " hello springboot2.0";
    }

    @ResponseBody
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public Object home() {
        return "hello springboot2.0 home";
    }
}
