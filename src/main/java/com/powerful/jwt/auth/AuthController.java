package com.powerful.jwt.auth;

import com.powerful.jwt.auth.rbac.JwtUserRole;
import com.powerful.jwt.auth.rbac.JwtUserRoleRepo;
import jakarta.validation.Valid;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/auth")
public class AuthController {
    private final AuthService authService;
	private final JwtUserRoleRepo jwtUserRoleRepo;

	public AuthController(AuthService authService, JwtUserRoleRepo jwtUserRoleRepo) {
        this.authService = authService;
		this.jwtUserRoleRepo = jwtUserRoleRepo;
	}

    @PostMapping("/login")
    public LoginResponse login(@Valid @RequestBody LoginRequest request) {
        return authService.login(request);
    }

    public record Me(String username, List<String> roles) {}
    @GetMapping
    public Me getMe() {
		final String username = (String) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return new Me(username, jwtUserRoleRepo.findByUsername(username).stream().map(JwtUserRole::getRole).toList());
    }
}
