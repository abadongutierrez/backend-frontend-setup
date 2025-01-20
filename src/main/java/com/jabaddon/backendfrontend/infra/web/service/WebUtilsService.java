package com.jabaddon.backendfrontend.infra.web.service;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.stereotype.Service;

@Service
@Scope(value = "request", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class WebUtilsService {

    private final HttpServletRequest request;

    public WebUtilsService(HttpServletRequest request) {
        this.request = request;
    }

    public String getCrsfToken() {
        CsrfToken csrfToken = (CsrfToken) request.getAttribute(CsrfToken.class.getName());
        return csrfToken.getToken();
    }

    public boolean isSessionActive() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return authentication != null &&
                authentication.isAuthenticated() &&
                !"anonymousUser".equals(authentication.getPrincipal());
    }
}
