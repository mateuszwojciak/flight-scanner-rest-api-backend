package com.project.travelagency.repository;

import com.project.travelagency.domain.Hotel;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface HotelRepository extends CrudRepository <Hotel, Long> {

    @Override
    List<Hotel> findAll();
}
