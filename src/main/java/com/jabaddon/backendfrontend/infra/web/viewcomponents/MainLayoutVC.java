package com.jabaddon.backendfrontend.infra.web.viewcomponents;

import com.jabaddon.backendfrontend.infra.web.service.WebUtilsService;
import de.tschuehly.spring.viewcomponent.core.component.ViewComponent;
import de.tschuehly.spring.viewcomponent.jte.ViewContext;

@ViewComponent
public class MainLayoutVC {
    public record MainLayoutView(String crsfToken, boolean sessionActive,
                                 ViewContext contentViewComponent) implements ViewContext {
    }

    public ViewContext render(WebUtilsService webUtilsService, ViewContext contentViewComponent) {
        return new MainLayoutView(webUtilsService.getCrsfToken(), webUtilsService.isSessionActive(), contentViewComponent);
    }
}
