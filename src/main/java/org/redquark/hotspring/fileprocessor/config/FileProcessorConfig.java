package org.redquark.hotspring.fileprocessor.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FileProcessorConfig {

    @Bean
    @ConfigurationProperties(prefix = "file-processor-config.s3")
    public AWSConfig getAWSConfig() {
        return new AWSConfig();
    }

    @Bean
    @ConfigurationProperties(prefix = "file-processor-config.crypto")
    public CryptoConfig getCryptoConfig() {
        return new CryptoConfig();
    }
}