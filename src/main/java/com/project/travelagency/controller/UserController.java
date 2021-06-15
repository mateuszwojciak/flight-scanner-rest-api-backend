package com.project.travelagency.controller;

import com.project.travelagency.domain.User;
import com.project.travelagency.domain.dto.UserDto;
import com.project.travelagency.mapper.UserMapper;
import com.project.travelagency.service.UserDatabase;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/user")
@CrossOrigin("*")
public class UserController {
    private final UserDatabase userDatabase;
    private final UserMapper userMapper;

    public UserController(UserDatabase userDatabase, UserMapper userMapper) {
        this.userDatabase = userDatabase;
        this.userMapper = userMapper;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/getUsers")
    public List<UserDto> getUsers(){
        List<User> users = userDatabase.showAllUsers();
        return userMapper.mapToUserDtoList(users);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/getUser/{userId}")
    public UserDto getUser(@PathVariable Long userId) throws UserNotFoundException {
        return userMapper.mapToUserDto(userDatabase.showUser(userId).orElseThrow(UserNotFoundException::new));
    }

    @RequestMapping(method = RequestMethod.POST, value = "/createNewUser", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void createUser(@RequestBody UserDto userDto) {
        userDatabase.saveUser(userMapper.mapToUser(userDto));
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/editUser", consumes = MediaType.APPLICATION_JSON_VALUE)
    public User editUser(@RequestBody UserDto userDto){
        return userDatabase.saveUser(userMapper.mapToUser(userDto));
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/deleteUser/{userId}")
    public void deleteUser(@PathVariable Long userId) {
        userDatabase.deleteUser(userId);
    }
}
