package com.example.security.service;

import io.jsonwebtoken.Claims;

public interface JwtService {

    String extractUsername(String token);
    Claims extractAllClaims(String token);

}
