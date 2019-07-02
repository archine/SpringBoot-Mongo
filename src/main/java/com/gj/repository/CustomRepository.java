package com.gj.repository;

import com.gj.domain.Custom;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Gjing
 **/
@Repository
public interface CustomRepository extends MongoRepository<Custom, Integer> {

}
