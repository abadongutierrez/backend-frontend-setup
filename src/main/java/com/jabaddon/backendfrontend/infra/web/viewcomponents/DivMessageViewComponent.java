package com.jabaddon.backendfrontend.infra.web.viewcomponents;

import de.tschuehly.spring.viewcomponent.core.component.ViewComponent;
import de.tschuehly.spring.viewcomponent.jte.ViewContext;

@ViewComponent
public class DivMessageViewComponent {
    public record DivMessageView(String message) implements ViewContext { }

    public ViewContext render(String message) {
        return new DivMessageView(message);
    }
}
