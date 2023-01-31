package com.example.security.service;

import io.jsonwebtoken.Claims;

import java.util.function.Function;

public interface JwtService {

    String extractUsername(String token);
    Claims extractAllClaims(String token);
    <T> T extractClaim(String token, Function<Claims, T> claimsResolver);

}
