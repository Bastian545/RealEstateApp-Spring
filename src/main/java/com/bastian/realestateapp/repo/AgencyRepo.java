package com.bastian.realestateapp.repo;

import com.bastian.realestateapp.model.Agency;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author bsoto
 * @project realestateapp
 * @created at 15-01-2023
 */
public interface AgencyRepo extends MongoRepository<Agency,String> {
}
