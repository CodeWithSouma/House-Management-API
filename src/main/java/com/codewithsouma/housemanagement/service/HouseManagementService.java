package com.codewithsouma.housemanagement.service;

import com.codewithsouma.housemanagement.entity.House;
import com.codewithsouma.housemanagement.repository.HouseManagementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HouseManagementService {
    @Autowired
    private HouseManagementRepository repository;

    public House saveHouse(House house){
        return repository.save(house);
    }

    public List<House> getHouseByType(String type){
        return repository.getHouseByType(type);
    }

    public String deleteHouseById(long houseId){
        repository.deleteById(houseId);
        return "Successfully deleted : "+houseId;
    }

    public List<House> getAllHouse(){
        return repository.findAll();
    }

    public House getHouseById(long houseId){
        return repository.findById(houseId).orElse(null);
    }
}
