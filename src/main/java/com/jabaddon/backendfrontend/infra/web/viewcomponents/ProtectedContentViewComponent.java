package com.jabaddon.backendfrontend.infra.web.viewcomponents;

import com.jabaddon.backendfrontend.infra.web.service.WebUtilsService;
import de.tschuehly.spring.viewcomponent.core.component.ViewComponent;
import de.tschuehly.spring.viewcomponent.jte.ViewContext;
import org.springframework.web.servlet.View;

@ViewComponent
public class ProtectedContentViewComponent {
    public record ProtectedContentView(String crsfToken) implements ViewContext {
    }

    public ViewContext render(WebUtilsService webUtilsService) {
        return new ProtectedContentView(webUtilsService.getCrsfToken());
    }
}
