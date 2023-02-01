package com.example.security.serviceImpl;

import com.example.security.repository.UserRepository;
import com.example.security.service.UserDetailsService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public UserDetails loadByUsername(String userEmail) {
        return userRepository
                .findByEmail(userEmail)
                .orElseThrow();
    }

}
