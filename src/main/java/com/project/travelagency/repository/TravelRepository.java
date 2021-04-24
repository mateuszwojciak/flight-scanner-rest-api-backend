package com.project.travelagency.repository;

import com.project.travelagency.domain.Travel;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TravelRepository extends CrudRepository <Travel, Long> {

    @Override
    List<Travel> findAll();
}
