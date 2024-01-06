package com.el.travelease.controllers;

import com.el.travelease.dto.TravelListDTO;
import com.el.travelease.dto.TravelMinDTO;
import com.el.travelease.services.TravelListService;
import com.el.travelease.services.TravelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class TravelListController {

    @Autowired
    private TravelListService travelListService;


    @Autowired
    private TravelService travelService;

    @GetMapping
    public List<TravelListDTO> findAll() {
        List<TravelListDTO> result = travelListService.findAll();
        return result;
    }

    @GetMapping(value ="/{listId}/travels")
    public List<TravelMinDTO> findByList(@PathVariable Long listId) {
        List<TravelMinDTO> result = travelService.findByList(listId);
        return result;
    }
}
