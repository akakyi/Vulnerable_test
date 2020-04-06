package com.simbirsoft.test_task.util;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum RoleName {

    USER("USER"),

    ADMIN("ADMIN");

    @Getter
    private final String value;

}
