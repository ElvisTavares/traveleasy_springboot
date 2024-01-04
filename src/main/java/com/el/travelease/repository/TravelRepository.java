package com.el.travelease.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.el.travelease.entities.Travel;

public interface TravelRepository extends JpaRepository<Travel, Long> {

}
