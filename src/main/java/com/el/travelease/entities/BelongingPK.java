package com.el.travelease.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class BelongingPK {
    @ManyToOne
    @JoinColumn(name = "travel_id")
    private Travel travel;

    @ManyToOne
    @JoinColumn(name = "list_id")
    private TravelList list;

    public BelongingPK() {

    }
    public BelongingPK(Travel travel, TravelList list) {
        this.travel = travel;
        this.list = list;
    }

    public Travel getTravel() {
        return travel;
    }

    public void setTravel(Travel travel) {
        this.travel = travel;
    }

    public TravelList getList() {
        return list;
    }

    public void setList(TravelList list) {
        this.list = list;
    }
}
