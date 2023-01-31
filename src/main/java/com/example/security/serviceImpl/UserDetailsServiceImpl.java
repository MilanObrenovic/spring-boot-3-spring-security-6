package com.example.security.serviceImpl;

import com.example.security.service.UserDetailsService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Override
    public UserDetails loadByUsername(String userEmail) {
        return null;
    }

}
