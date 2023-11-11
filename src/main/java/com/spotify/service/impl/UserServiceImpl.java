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
import com.spotify.ultils.Constraints;
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
        UserResponseType response;
        if (null != userResponseType.getId() && usersOptional.isPresent()) {
            Users userSave = usersOptional.get();
            userSave.setEmail(!userSave.getEmail().equals(users.getEmail()) ? users.getEmail() : userSave.getEmail());
            userSave.setActiveStatus(userSave.getActiveStatus() != users.getActiveStatus() ? users.getActiveStatus() : userSave.getActiveStatus());
            userSave.setBirthDay(userSave.getBirthDay() != users.getBirthDay() ? users.getBirthDay() : userSave.getBirthDay());
            userSave.setFirstName(!userSave.getFirstName().equals(users.getFirstName()) ? users.getFirstName() : userSave.getFirstName());
            userSave.setLastName(!userSave.getLastName().equals(users.getLastName()) ? users.getLastName() : userSave.getLastName());
            userSave.setPhoneNumber(!userSave.getPhoneNumber().equals(users.getPhoneNumber()) ? users.getPhoneNumber() : userSave.getPhoneNumber());
            if (users.getPassword() != null) {
                if (users.getPassword().matches(users.getPassword())) {
                    userSave.setPassword(users.getPassword());
                }
            }
            Users userUpdate = userRepository.save(userSave);
            response = userConvert.convertToDto(userUpdate);
        } else {
            users.setRoles(roleRepository.getById(Constraints.ROLE_USER_ID));
            Users userSave = userRepository.save(users);
            response = userConvert.convertToDto(userSave);
        }
        return response;
    }
}
