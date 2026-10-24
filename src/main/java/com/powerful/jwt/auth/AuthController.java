package com.powerful.jwt.auth;

import jakarta.validation.Valid;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {
    private final AuthService authService;

	public AuthController(AuthService authService) {
        this.authService = authService;
	}

    @PostMapping("/login")
    public LoginResponse login(@Valid @RequestBody LoginRequest request) {
        return authService.login(request);
    }

    public record Me(String username) {}
    @GetMapping
    public Me getMe() {
        return new Me((String) SecurityContextHolder.getContext().getAuthentication().getPrincipal());
    }
}
