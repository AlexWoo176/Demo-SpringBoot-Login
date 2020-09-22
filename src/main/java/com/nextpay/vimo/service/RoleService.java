package com.nextpay.vimo.service;

import com.nextpay.vimo.model.Role;

public interface RoleService {
    Role findRoleByName(String roleName);
}
