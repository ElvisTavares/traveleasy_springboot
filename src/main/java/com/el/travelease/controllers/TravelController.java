package com.el.travelease.controllers;

import java.util.List;

import com.el.travelease.dto.TravelDTO;
import com.el.travelease.dto.TravelStoreDTO;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.el.travelease.dto.TravelMinDTO;
import com.el.travelease.entities.Travel;
import com.el.travelease.services.TravelService;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping(value = "/travel")
public class TravelController {
	
	@Autowired
	private TravelService travelService;
	
	@GetMapping
	public ResponseEntity<List<TravelMinDTO>> findAll()
	{
		List<Travel> result = travelService.findAll();
		List<TravelMinDTO> dto = result.stream().map(x -> new TravelMinDTO(x)).toList();

		return ResponseEntity.ok(dto);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<TravelDTO> findById(@PathVariable Long id) {
		TravelDTO result = travelService.findById(id);
		return ResponseEntity.ok(result);
	}

	@PostMapping
	public  ResponseEntity<Travel> store(@Valid @RequestBody TravelStoreDTO data, UriComponentsBuilder uriBuilder) {
		var travel = travelService.store(data);
		var uri = uriBuilder.path("travel/{id}").buildAndExpand(travel.getId()).toUri();

		return ResponseEntity.created(uri).body(new Travel(travel));
	}

}
