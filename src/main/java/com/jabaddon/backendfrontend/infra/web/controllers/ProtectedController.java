package com.jabaddon.backendfrontend.infra.web.controllers;

import com.jabaddon.backendfrontend.infra.web.service.WebUtilsService;
import com.jabaddon.backendfrontend.infra.web.viewcomponents.MainLayoutVC;
import com.jabaddon.backendfrontend.infra.web.viewcomponents.ProtectedContentViewComponent;
import de.tschuehly.spring.viewcomponent.jte.ViewContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/protected")
public class ProtectedController {
    public final MainLayoutVC mainLayoutVC;
    public final ProtectedContentViewComponent protectedContentViewComponent;
    public final WebUtilsService webUtilsService;

    public ProtectedController(MainLayoutVC mainLayoutVC, ProtectedContentViewComponent protectedContentViewComponent, WebUtilsService webUtilsService) {
        this.mainLayoutVC = mainLayoutVC;
        this.protectedContentViewComponent = protectedContentViewComponent;
        this.webUtilsService = webUtilsService;
    }

    @GetMapping
    public ViewContext index() {
        return mainLayoutVC.render(
                webUtilsService,
                protectedContentViewComponent.render(webUtilsService));
    }
}
