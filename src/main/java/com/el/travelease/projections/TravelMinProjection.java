package com.el.travelease.projections;

import java.time.LocalDate;

public interface TravelMinProjection {

    Long getId();
//    String getDestiny();
    LocalDate getDepartureDate();
//    LocalDate getReturnDate();
    String getMeansOfTransport();
//    String getAccommodation();
    String getBudget();

}
