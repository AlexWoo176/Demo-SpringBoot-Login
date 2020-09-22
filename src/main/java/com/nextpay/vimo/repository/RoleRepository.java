package com.nextpay.vimo.repository;

import com.nextpay.vimo.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findRoleByName(String roleName);
}
