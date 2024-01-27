package com.el.travelease.services;

import java.util.List;

import com.el.travelease.dto.TravelDTO;
import com.el.travelease.dto.TravelMinDTO;
import com.el.travelease.dto.TravelStoreDTO;
import com.el.travelease.projections.TravelMinProjection;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.el.travelease.entities.Travel;
import com.el.travelease.repository.TravelRepository;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class TravelService {

	@Autowired
	private TravelRepository travelRepository;
	
	public List<Travel> findAll() {
		List<Travel> result = travelRepository.findAll();
		return result;
	}

	@Transactional
	public TravelDTO findById(Long id){
		Travel result = travelRepository.findById(id).get();
		return new TravelDTO(result);
	}

	public List<TravelMinDTO> findByList(Long listId) {
		List<TravelMinProjection> result = travelRepository.searchByList(listId);
		return result.stream().map(x -> new TravelMinDTO(x)).toList();
	}

	@Transactional
	public Travel store(TravelStoreDTO data) {
		var travel = new Travel(data);
		travelRepository.save(travel);

		return  travel;
	}
}
