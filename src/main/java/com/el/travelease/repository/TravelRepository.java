package com.el.travelease.repository;

import com.el.travelease.projections.TravelMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;

import com.el.travelease.entities.Travel;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TravelRepository extends JpaRepository<Travel, Long> {
    @Query(nativeQuery = true, value = """
        SELECT tb_travel.id, tb_travel.destiny, tb_travel.departure_date AS `departureDate`, tb_travel.return_date AS returnDate,
        		tb_travel.means_of_transport AS meansOfTransport, tb_travel.accommodation, tb_travel.budget, tb_belonging.position
        		FROM tb_travel
        INNER JOIN tb_belonging ON tb_travel.id = tb_belonging.travel_id
        WHERE tb_belonging.list_id = :listId
        ORDER BY tb_belonging.position
        """)
    List<TravelMinProjection> searchByList(Long listId);
}
