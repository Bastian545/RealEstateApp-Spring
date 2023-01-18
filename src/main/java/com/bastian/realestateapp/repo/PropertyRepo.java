package com.bastian.realestateapp.repo;

import com.bastian.realestateapp.model.Property;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * @author bsoto
 * @project realestateapp
 * @created at 15-01-2023
 */
public interface PropertyRepo extends MongoRepository<Property,String> {

    List<Property> findByAddress_CityOrAddress_Municipality(String city,String muni);
}
