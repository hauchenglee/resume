package com.doubai.resume.service;

import com.doubai.resume.model.Mongo;

import java.util.List;
import java.util.Optional;

public interface MongoService {
    void save(Mongo mongo);

    Optional<Mongo> findOne(String id);

    List<Mongo> findByNameContains(String name);
}
