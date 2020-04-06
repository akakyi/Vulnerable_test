package com.simbirsoft.test_task.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.argon2.Argon2PasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class SecurityBeansConfig {

    @Bean
    public PasswordEncoder passwordEncoder() {
        Argon2PasswordEncoder encoder
                = new Argon2PasswordEncoder(
                    /*saltLength*/ 16,
                    /*hashLength*/ 32,
                    /*parallelism*/1,
                    /*memory*/ 4096,
                    /*iterations*/ 3
        );
        return encoder;
    }

}
