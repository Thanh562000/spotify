package com.spotify.ultils;

/*
 * @project_name: spotify_backend
 * @package: com.spotify.ultils
 * @author: Admin
 * @version: v1.0
 */

public enum RoleEnum {
    ROLE_ADMIN("Admin"),
    ROLE_USER("User");

    private String value;

    RoleEnum(String value) {
        this.value = value;
    }
}
