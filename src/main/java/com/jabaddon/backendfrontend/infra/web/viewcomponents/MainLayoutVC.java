package com.jabaddon.backendfrontend.infra.web.viewcomponents;

import de.tschuehly.spring.viewcomponent.core.component.ViewComponent;
import de.tschuehly.spring.viewcomponent.jte.ViewContext;

@ViewComponent
public class MainLayoutVC {

    public record MainLayoutView(ViewContext contentViewComponent) implements ViewContext {}

    public ViewContext render(ViewContext contentViewComponent) {
        return new MainLayoutView(contentViewComponent);
    }
}
