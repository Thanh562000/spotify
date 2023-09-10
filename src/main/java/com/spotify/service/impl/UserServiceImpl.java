package com.spotify.service.impl;

/*
 * @project_name: spotify_backend
 * @package: com.spotify.service.impl
 * @author: Admin
 * @version: v1.0
 */

import com.spotify.dto.convert.UserConvert;
import com.spotify.dto.response.UserResponseType;
import com.spotify.entities.Users;
import com.spotify.repository.RoleRepository;
import com.spotify.repository.UserRepository;
import com.spotify.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final UserConvert userConvert;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, RoleRepository roleRepository, UserConvert userConvert) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.userConvert = userConvert;
    }


    @Override
    public UserResponseType saveUser(UserResponseType userResponseType) {
        Users users = userConvert.convertToEntity(userResponseType);
        Optional<Users> usersOptional = Optional.of(userRepository.findById(users.getId() == null ? 0 : users.getId())).orElse(null);
        UserResponseType response = null;
        if (null != userResponseType.getId() && usersOptional.isPresent()) {
            Users userSave = usersOptional.get();
            if (userSave.getAvatar().equals(users.getAvatar())) {
                userSave.setAvatar(users.getAvatar());
            }
            Users userUpdate = userRepository.save(userSave);
            response = userConvert.convertToDto(userUpdate);
        }
        return response;
    }
}
