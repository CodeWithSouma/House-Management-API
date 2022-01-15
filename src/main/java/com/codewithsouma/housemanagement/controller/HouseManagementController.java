package com.codewithsouma.housemanagement.controller;

import com.codewithsouma.housemanagement.entity.House;
import com.codewithsouma.housemanagement.service.HouseManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HouseManagementController {
    @Autowired
    private HouseManagementService service;

    @PostMapping("/saveHouse")
    public House saveHouse(@RequestBody House house){
        return service.saveHouse(house);
    }

    @GetMapping("/getByType")
    public List<House> getHouseByType(@RequestParam String type){
        return service.getHouseByType(type);
    }

    @DeleteMapping("/deleteHouse")
    public String deleteHouseById(@RequestParam long id){
        return service.deleteHouseById(id);
    }

    @GetMapping("/getAllHouse")
    public List<House> getAllHouse(){
        return service.getAllHouse();
    }

    @GetMapping("/getHouse")
    public House getHouseById(@RequestParam Long id){
        return service.getHouseById(id);
    }
}
