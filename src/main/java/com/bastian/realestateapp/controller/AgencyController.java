package com.bastian.realestateapp.controller;

import com.bastian.realestateapp.model.Agency;
import com.bastian.realestateapp.repo.AgencyRepo;
import jakarta.el.PropertyNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author bsoto
 * @project realestateapp
 * @created at 15-01-2023
 */
@RestController
@RequestMapping("/real")
public class AgencyController {
    @Autowired
    private AgencyRepo agencyRepo;

    @GetMapping("/agencies")
    public List<Agency> findAll(){
        return agencyRepo.findAll();
    }

    @GetMapping("/agencies/{id}")
    public Agency findById(String id){
        return agencyRepo.findById(id).orElseThrow(()->new PropertyNotFoundException(id));
    }

    @PostMapping("/agencies")
    Agency newItem(@RequestBody Agency agency) {
        return agencyRepo.save(agency);
    }

    @DeleteMapping ("/agencies/{id}")
    void deleteItem (@PathVariable String id){
        agencyRepo.deleteById(id);
    }

}
