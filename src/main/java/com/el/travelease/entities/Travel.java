package com.el.travelease.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_travel")
public class Travel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String destiny;
	private LocalDate departureDate;
	private LocalDate returnDate;
	private String meansOfTransport;
	private String accommodation;
	private BigDecimal budget;
	
	public Travel() {
		
	}

	public Travel(Long id, String destiny, LocalDate departureDate, LocalDate returnDate, String meansOfTransport,
			String accommodation, BigDecimal budget) {
		super();
		this.id = id;
		this.destiny = destiny;
		this.departureDate = departureDate;
		this.returnDate = returnDate;
		this.meansOfTransport = meansOfTransport;
		this.accommodation = accommodation;
		this.budget = budget;
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

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Travel other = (Travel) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
