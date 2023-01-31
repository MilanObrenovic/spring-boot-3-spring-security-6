package com.example.security.config;

import com.example.security.repository.UserRepository;
import com.example.security.service.UserDetailsService;
import com.example.security.serviceImpl.UserDetailsServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

@Configuration
@RequiredArgsConstructor
public class ApplicationConfig {

    private final UserRepository repository;

    @Bean
    public UserDetailsService userDetailsService() {
        return username -> repository
                .findByEmail(username)
                .orElseThrow(() -> new UsernameNotFoundException("User not found."));
    }

}
