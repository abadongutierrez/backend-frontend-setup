package com.jabaddon.backendfrontend.infra.web.controllers;

import com.jabaddon.backendfrontend.infra.web.viewcomponents.MainLayoutVC;
import com.jabaddon.backendfrontend.infra.web.viewcomponents.ViteCounterExampleViewComponent;
import de.tschuehly.spring.viewcomponent.jte.ViewContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexController {

    private final MainLayoutVC mainLayoutViewComponent;
    private final ViteCounterExampleViewComponent viteCounterExampleViewComponent;

    public IndexController(MainLayoutVC mainLayoutViewComponent, ViteCounterExampleViewComponent viteCounterExampleViewComponent) {
        this.mainLayoutViewComponent = mainLayoutViewComponent;
        this.viteCounterExampleViewComponent = viteCounterExampleViewComponent;
    }

    @GetMapping
    public ViewContext index() {
        return mainLayoutViewComponent.render(viteCounterExampleViewComponent.render());
    }
}
