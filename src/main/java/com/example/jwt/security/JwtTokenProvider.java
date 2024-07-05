package com.example.jwt.security;

import com.example.jwt.domain.Role;
import jakarta.annotation.PostConstruct;
import jakarta.servlet.http.HttpServletRequest;
import java.security.Key;
import java.util.List;

public class JwtTokenProvider {

    @PostConstruct
    protected void init() {
    }

    public String createToken(String username, List<Role> roles) {
        return null;
    }

    private Key getSignKey(String secretKey) {
        return null;
    }

    public void setSecurityContext(String token) {

    }

    public String getUsername(String token) {
        return null;
    }

    // 이 메소드 반환형 Claims
    public Object getClaimsFromToken(String token) {
        return null;
    }

    public String resolveToken(HttpServletRequest request) {
        return null;
    }

    public boolean validateToken(String token) {
        return true;
    }

}
