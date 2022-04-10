package com.storm.registrationlogin.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "storm")
@Getter
@Setter
public class JWTConfig {

    private String jwtSecret;
    private Integer jwtExpirationMs;
    private String jwtCookie;
}
