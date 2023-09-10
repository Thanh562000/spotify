package com.spotify.service;

/*
 * @project_name: spotify_backend
 * @package: com.spotify.service
 * @author: Admin
 * @version: v1.0
 */

import com.spotify.dto.response.UserResponseType;

public interface UserService {
    UserResponseType saveUser(UserResponseType userResponseType);
}
