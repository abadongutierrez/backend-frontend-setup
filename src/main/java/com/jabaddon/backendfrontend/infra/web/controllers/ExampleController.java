package com.jabaddon.backendfrontend.infra.web.controllers;

import com.jabaddon.backendfrontend.infra.web.viewcomponents.DivMessageViewComponent;
import de.tschuehly.spring.viewcomponent.jte.ViewContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/example")
public class ExampleController {

    private final DivMessageViewComponent divMessageViewComponent;

    public ExampleController(DivMessageViewComponent divMessageViewComponent) {
        this.divMessageViewComponent = divMessageViewComponent;
    }

    @PostMapping("/clicked")
    public ViewContext clicked() {
        return divMessageViewComponent.render("Hey HTMX!!");
    }

    @GetMapping
    public String index() {
        return "templates/example";
    }
}
