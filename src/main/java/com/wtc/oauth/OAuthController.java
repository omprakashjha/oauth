package com.wtc.oauth;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OAuthController {
    
    @PreAuthorize("#oauth2.hasScope('view_products:salmon-dev-1')")
    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }
}