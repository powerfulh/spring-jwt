package com.powerful.jwt.auth.rbac;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class JwtRole {
	@Id
	String role;
	String name;
}
