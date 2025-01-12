package com.jabaddon.backendfrontend.infra.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/example")
public class ExampleController {

    @PostMapping("/clicked")
    public String clicked() {
        return "example/fragments/clicked";
    }
}
