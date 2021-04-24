package com.project.travelagency.repository;

import com.project.travelagency.domain.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository <User, Long> {

    @Override
    List<User> findAll();
}
