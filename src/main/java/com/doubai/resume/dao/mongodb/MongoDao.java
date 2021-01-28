package com.doubai.resume.dao.mongodb;

import com.doubai.resume.model.Mongo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MongoDao extends MongoRepository<Mongo,String>{

    @Query
    List<Mongo> findByNameContains(String name);
}
