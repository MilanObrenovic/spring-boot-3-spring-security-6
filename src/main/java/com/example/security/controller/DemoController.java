package com.example.security.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/demo")
public class DemoController {

    /**
     * This route is non-jwt gated, meaning anyone can access it.
     * This was set to unsecured in WebSecurityConfig.java like this:
     * .requestMatchers(..., "/api/v1/demo/unsecured")
     * @return string status.
     */
    @GetMapping("/unsecured")
    public ResponseEntity<String> unsecuredRoute() {
        return ResponseEntity.ok("This endpoint is not secured");
    }

    @Secured({"ADMIN", "USER"})
    @GetMapping("/secured-user")
    public ResponseEntity<String> userRoute() {
        System.out.println("called user route");
        return ResponseEntity.ok("This endpoint is secured and can be accessed by ROLE_USER.");
    }

    @Secured({"ADMIN"})
    @GetMapping("/secured-admin")
    public ResponseEntity<String> adminRoute() {
        return ResponseEntity.ok("This endpoint is secured and can be accessed by ROLE_ADMIN.");
    }

}
