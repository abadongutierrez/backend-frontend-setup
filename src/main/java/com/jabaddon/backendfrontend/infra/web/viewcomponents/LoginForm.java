package com.jabaddon.backendfrontend.infra.web.viewcomponents;

import com.jabaddon.backendfrontend.infra.web.service.WebUtilsService;
import de.tschuehly.spring.viewcomponent.core.component.ViewComponent;
import de.tschuehly.spring.viewcomponent.jte.ViewContext;

@ViewComponent
public class LoginForm {
    public record LoginFormView(String crsfToken, String message) implements ViewContext { }

    public ViewContext render(WebUtilsService webUtilsService, String message) {
        return new LoginFormView(webUtilsService.getCrsfToken(), message);
    }
}
