package com.el.travelease.dto;

import java.time.LocalDate;

import com.el.travelease.entities.Travel;
import com.el.travelease.projections.TravelMinProjection;

public class TravelMinDTO {

	private Long id;
	private LocalDate departureDate;
	private String meansOfTransport;
	
	public TravelMinDTO() {
		
	}

	public TravelMinDTO(Travel entity) {

		id = entity.getId();
		departureDate = entity.getDepartureDate();
		meansOfTransport = entity.getMeansOfTransport();
	}

	public TravelMinDTO(TravelMinProjection projection) {

		id = projection.getId();
		departureDate = projection.getDepartureDate();
		meansOfTransport = projection.getMeansOfTransport();
	}

	public Long getId() {
		return id;
	}

	public LocalDate getDepartureDate() {
		return departureDate;
	}

	public String getMeansOfTransport() {
		return meansOfTransport;
	}
}
