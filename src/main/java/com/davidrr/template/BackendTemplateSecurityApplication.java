package com.davidrr.template;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {
        "com.davidrr.template",
        "com.davidrr.security"
})
public class BackendTemplateSecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackendTemplateSecurityApplication.class, args);
    }

}
