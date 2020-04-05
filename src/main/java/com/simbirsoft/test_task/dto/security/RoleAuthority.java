package com.simbirsoft.test_task.dto.security;

import com.simbirsoft.test_task.db.entity.Role;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;

@RequiredArgsConstructor
public class RoleAuthority implements GrantedAuthority {

    private final Role role;

    @Override
    public String getAuthority() {
        return this.role.getName();
    }
}
