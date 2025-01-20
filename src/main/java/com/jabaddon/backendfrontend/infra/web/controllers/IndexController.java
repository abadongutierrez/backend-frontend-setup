package com.jabaddon.backendfrontend.infra.web.controllers;

import com.jabaddon.backendfrontend.infra.web.service.WebUtilsService;
import com.jabaddon.backendfrontend.infra.web.viewcomponents.MainLayoutVC;
import com.jabaddon.backendfrontend.infra.web.viewcomponents.ViteCounterExampleViewComponent;
import de.tschuehly.spring.viewcomponent.jte.ViewContext;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexController {

    private final MainLayoutVC mainLayoutViewComponent;
    private final ViteCounterExampleViewComponent viteCounterExampleViewComponent;
    private final WebUtilsService webUtilsService;

    public IndexController(MainLayoutVC mainLayoutViewComponent, ViteCounterExampleViewComponent viteCounterExampleViewComponent, WebUtilsService webUtilsService) {
        this.mainLayoutViewComponent = mainLayoutViewComponent;
        this.viteCounterExampleViewComponent = viteCounterExampleViewComponent;
        this.webUtilsService = webUtilsService;
    }

    @GetMapping
    public ViewContext index(HttpServletRequest request) {
        return mainLayoutViewComponent.render(
                webUtilsService,
                viteCounterExampleViewComponent.render());
    }
}
