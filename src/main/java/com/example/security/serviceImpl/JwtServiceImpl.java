package com.example.security.serviceImpl;

import com.example.security.service.JwtService;
import org.springframework.stereotype.Service;

@Service
public class JwtServiceImpl implements JwtService {

    @Override
    public String extractUsername(String token) {
        return null;
    }

}
