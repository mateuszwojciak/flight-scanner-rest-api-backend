package com.project.travelagency.service;

import com.project.travelagency.domain.Travel;
import com.project.travelagency.repository.TravelRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TravelDatabase {

    @Autowired
    private final TravelRepository travelRepository;

    public List<Travel> showAllTravels() {
        return travelRepository.findAll();
    }

    public Optional<Travel> showTravel(final Long travelId) {
        return travelRepository.findById(travelId);
    }

    public void addTravel(final Travel travel) {

    }

    public Travel modifyTravel(final Travel travel) {
        return travelRepository.save(travel);
    }

    public void removeTravel(final Long travelId) {
        travelRepository.deleteById(travelId);
    }
}
