package com.jsc.oauth.controller;

import com.jsc.oauth.model.CustomPrincipal;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * The type Resource controller.
 */
@RestController
public class ResourceController {

    /**
     * Context string.
     *
     * @return the string
     */
    @GetMapping("/admins")
    @PreAuthorize("hasAuthority('role_admin')")
    public String context() {
        CustomPrincipal principal = (CustomPrincipal) SecurityContextHolder.getContext().getAuthentication()
                .getPrincipal();
        return principal.getUsername() + " " + principal.getEmail();
    }

    /**
     * Secured string.
     *
     * @param principal the principal
     * @return the string
     */
    @GetMapping("/users")
    @PreAuthorize("hasAnyAuthority('role_admin','role_user')")
    public String secured(CustomPrincipal principal) {
        return principal.getUsername() + " " + principal.getEmail();
    }

    /**
     * General string.
     *
     * @return the string
     */
    @GetMapping("/common")
    public String general() {
        return "common api success";
    }

}
