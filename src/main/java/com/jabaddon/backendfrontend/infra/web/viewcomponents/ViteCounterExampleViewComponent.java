package com.jabaddon.backendfrontend.infra.web.viewcomponents;

import de.tschuehly.spring.viewcomponent.core.component.ViewComponent;
import de.tschuehly.spring.viewcomponent.jte.ViewContext;

@ViewComponent
public class ViteCounterExampleViewComponent {

    public record ViteCounterExampleView() implements ViewContext {}

    public ViewContext render() {
        return new ViteCounterExampleView();
    }
}
