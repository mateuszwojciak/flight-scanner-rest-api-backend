package com.project.travelagency.service;

import com.project.travelagency.domain.User;
import com.project.travelagency.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserDatabase {

    @Autowired
    private final UserRepository userRepository;

    public List<User> showAllUsers(){
        return userRepository.findAll();
    }

    public Optional<User> showUser(final Long userId) {
        return userRepository.findById(userId);
    }

    public void addUser(final User user) {

    }

    public User saveUser(final User user){
        return userRepository.save(user);
    }

    public void deleteUser(final Long userId){
        userRepository.deleteById(userId);
    }


}
