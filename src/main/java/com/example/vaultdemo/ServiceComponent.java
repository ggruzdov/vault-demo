package com.example.vaultdemo;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class ServiceComponent {

    private final ServiceProperties serviceProperties;

    @PostConstruct
    void postConstruct() {
        log.info(getServiceInfo());
    }

    public String getServiceInfo() {
        return "Project: " + serviceProperties.project() + ", Description: " + serviceProperties.description() + ", URL: " + serviceProperties.url();
    }
}
