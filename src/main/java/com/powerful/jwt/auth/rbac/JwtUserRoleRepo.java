package com.powerful.jwt.auth.rbac;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JwtUserRoleRepo extends JpaRepository<JwtUserRole, Integer> {
	List<JwtUserRole> findByUsername(String username);
}
