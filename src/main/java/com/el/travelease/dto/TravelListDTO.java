package com.el.travelease.dto;

import com.el.travelease.entities.TravelList;

public class TravelListDTO {

    private Long id;
    private String name;

    public TravelListDTO() {

    }

    public TravelListDTO(TravelList entity) {
        id = entity.getId();
        name = entity.getName();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
