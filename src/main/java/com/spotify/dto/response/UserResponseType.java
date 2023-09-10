package com.spotify.dto.response;

/*
 * @project_name: spotify_backend
 * @package: com.spotify.dto.response
 * @author: Admin
 * @version: v1.0
 */

import com.spotify.entities.Roles;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class UserResponseType {
    private Integer id;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private boolean gender;
    private LocalDate birthDay;
    private int activeStatus;
    private String email;
    private String phoneNumber;
    private String avatar;
    private Roles roles;
}
