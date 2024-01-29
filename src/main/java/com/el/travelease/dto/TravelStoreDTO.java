package com.el.travelease.dto;

import com.el.travelease.entities.Travel;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;
import org.springframework.beans.BeanUtils;

import java.math.BigDecimal;
import java.time.LocalDate;

public class TravelStoreDTO {

    private Long id;

    @NotBlank
    private String destiny;
    @Future
    private LocalDate departureDate;
    @Future
    private LocalDate returnDate;
    @NotBlank
    private String meansOfTransport;
    @NotBlank
    private String accommodation;
    private BigDecimal budget;

    public TravelStoreDTO() {

    }

    public TravelStoreDTO(Travel entity) {
        BeanUtils.copyProperties(entity, this, getClass());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDestiny() {
        return destiny;
    }

    public void setDestiny(String destiny) {
        this.destiny = destiny;
    }

    public LocalDate getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(LocalDate departureDate) {
        this.departureDate = departureDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public String getMeansOfTransport() {
        return meansOfTransport;
    }

    public void setMeansOfTransport(String meansOfTransport) {
        this.meansOfTransport = meansOfTransport;
    }

    public String getAccommodation() {
        return accommodation;
    }

    public void setAccommodation(String accommodation) {
        this.accommodation = accommodation;
    }

    public BigDecimal getBudget() {
        return budget;
    }

    public void setBudget(BigDecimal budget) {
        this.budget = budget;
    }
}
