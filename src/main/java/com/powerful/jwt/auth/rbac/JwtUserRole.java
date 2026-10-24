package com.powerful.jwt.auth.rbac;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class JwtUserRole {
	@Id
	int n;
	String role;
	String username;

	public String getRole() {
		return role;
	}
}
