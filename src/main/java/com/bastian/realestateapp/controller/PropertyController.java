package com.bastian.realestateapp.controller;

import com.bastian.realestateapp.model.Property;
import com.bastian.realestateapp.repo.PropertyRepo;
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
@RequestMapping("/real/properties")

public class PropertyController {
    @Autowired
    private PropertyRepo propertyRepo;

    @GetMapping("/all")
    List<Property> findAll(){
        return propertyRepo.findAll();
    }

    @GetMapping("/{id}")
    Property findById(@PathVariable String id){
        return propertyRepo.findById(id).orElseThrow(() -> new PropertyNotFoundException(id));
    }

    @PostMapping("/")
    Property newItem(@RequestBody Property newProp) {
        return propertyRepo.save(newProp);
    }

    @DeleteMapping ("/{id}")
    void deleteItem (@PathVariable String id){
        propertyRepo.deleteById(id);
    }



    //TODO FIX MAPPING
    @GetMapping("/search")
    List<Property> findByAddress_City(
            @RequestParam (value = "city", required = false) String city ,
            @RequestParam (value = "municipality", required = false) String municipality){
        return propertyRepo.findByAddress_CityOrAddress_Municipality(city,municipality);
    }

}
