package com.codewithsouma.housemanagement.repository;

import com.codewithsouma.housemanagement.entity.House;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HouseManagementRepository extends JpaRepository<House,Long> {
    List<House> getHouseByType(String type);
}
