package com.spotify.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.spotify.dto.response.UserResponseType;
import com.spotify.repository.UserRepository;
import com.spotify.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/*
 * @project_name: spotify_backend
 * @package: com.spotify.controller
 * @author: Admin
 * @version: v1.0
 */
@RestController
@RequestMapping("api/users")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public ResponseEntity<UserResponseType> registerUser(@RequestParam("user") String userJson) throws JsonProcessingException {
        ResponseEntity<UserResponseType> response;
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        UserResponseType userResponseType = mapper.readValue(userJson, UserResponseType.class);
        response = new ResponseEntity<>(userService.saveUser(userResponseType), HttpStatus.OK);
        return response;

    }

}
