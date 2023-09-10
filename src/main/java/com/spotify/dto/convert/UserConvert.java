package com.spotify.dto.convert;

/*
 * @project_name: spotify_backend
 * @package: com.spotify.dto.convert
 * @author: Admin
 * @version: v1.0
 */

import com.spotify.dto.response.UserResponseType;
import com.spotify.entities.Users;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;


@Component
public class UserConvert {
    private final ModelMapper modelMap = new ModelMapper();

    public UserResponseType convertToDto(Users users) {
        UserResponseType response = new UserResponseType();
        response.setUsername(users.getUsername());
        response.setPassword(users.getPassword());
        response.setFirstName(users.getFirstName());
        response.setLastName(users.getLastName());
        response.setGender(users.isGender());
        response.setBirthDay(users.getBirthDay());
        response.setActiveStatus(users.getActiveStatus());
        response.setEmail(users.getEmail());
        response.setPhoneNumber(users.getPhoneNumber());
        response.setAvatar(users.getAvatar());
        response.setRoles(users.getRoles());
        return response;
    }

    //Convert to entity
    public Users convertToEntity(UserResponseType userResponseType) {
        return modelMap.map(userResponseType, Users.class);
    }
}
