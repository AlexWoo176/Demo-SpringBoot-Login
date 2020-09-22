package com.nextpay.vimo.service.impl;

import com.nextpay.vimo.model.Role;
import com.nextpay.vimo.repository.RoleRepository;
import com.nextpay.vimo.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleRepository roleRepository;

    @Override
    public Role findRoleByName(String roleName) {
        return roleRepository.findRoleByName(roleName);
    }
}
