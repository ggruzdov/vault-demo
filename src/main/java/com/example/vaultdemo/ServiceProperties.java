package com.example.vaultdemo;

import jakarta.validation.constraints.NotBlank;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

@Validated
@ConfigurationProperties(prefix = "service")
public record ServiceProperties(
        @NotBlank
        String project,
        @NotBlank
        String description,
        @NotBlank
        String url
) {
}
