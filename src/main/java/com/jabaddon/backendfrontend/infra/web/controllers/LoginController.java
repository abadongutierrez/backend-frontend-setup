package com.jabaddon.backendfrontend.infra.web.controllers;

import com.jabaddon.backendfrontend.infra.web.service.WebUtilsService;
import com.jabaddon.backendfrontend.infra.web.viewcomponents.LoginForm;
import com.jabaddon.backendfrontend.infra.web.viewcomponents.MainLayoutVC;
import de.tschuehly.spring.viewcomponent.jte.ViewContext;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/auth")
public class LoginController {
    private final MainLayoutVC mainLayoutVC;
    private final LoginForm loginForm;
    private final WebUtilsService webUtilsService;

    public LoginController(MainLayoutVC mainLayoutVC, LoginForm loginForm, WebUtilsService webUtilsService) {
        this.mainLayoutVC = mainLayoutVC;
        this.loginForm = loginForm;
        this.webUtilsService = webUtilsService;
    }

    @GetMapping("/login")
    public ViewContext login(HttpServletRequest request) {
        return mainLayoutVC.render(
                webUtilsService,
                loginForm.render(webUtilsService,"Login"));
    }
}
