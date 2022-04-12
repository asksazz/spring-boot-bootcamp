package io.grokkinginterviews.restaurantservice.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class AppController {
    @Value("1.0.0.1")
    private String appVersion;

    @GetMapping("/")
    public Map<String, String> getAppInfo() {
        Map<String, String> appVersionMap = new HashMap();
        appVersionMap.put("app-name", "Restaurant Microservice");
        appVersionMap.put("app-version", appVersion);
        return appVersionMap;
    }
}
