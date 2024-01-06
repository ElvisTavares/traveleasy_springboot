package com.el.travelease.services;

import com.el.travelease.dto.TravelListDTO;
import com.el.travelease.entities.TravelList;
import com.el.travelease.repository.TravelListRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TravelListService {

    @Autowired
    private TravelListRepository travelListRepository;

    public List<TravelListDTO> findAll() {
        List<TravelList> result = travelListRepository.findAll();
        return result.stream().map(x -> new TravelListDTO(x)).toList();
    }
}
