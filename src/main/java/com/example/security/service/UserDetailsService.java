package com.example.security.service;

import org.springframework.security.core.userdetails.UserDetails;

public interface UserDetailsService {

    UserDetails loadByUsername(String userEmail);

}
