package com.el.travelease.controllers;

import java.util.List;

import com.el.travelease.dto.TravelDTO;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.el.travelease.dto.TravelMinDTO;
import com.el.travelease.entities.Travel;
import com.el.travelease.services.TravelService;

@RestController
@RequestMapping(value = "/travel")
public class TravelController {
	
	@Autowired
	private TravelService travelService;
	
	@GetMapping
	public List<TravelMinDTO> findAll()
	{
		List<Travel> result = travelService.findAll();
		List<TravelMinDTO> dto = result.stream().map(x -> new TravelMinDTO(x)).toList();
		
		return dto;
	}

	@GetMapping(value = "/{id}")
	public TravelDTO findById(@PathVariable Long id) {
		TravelDTO result = travelService.findById(id);
		return result;
	}

}
