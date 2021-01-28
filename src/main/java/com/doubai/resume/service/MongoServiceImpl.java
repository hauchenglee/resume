package com.doubai.resume.service;

import com.doubai.resume.dao.mongodb.MongoDao;
import com.doubai.resume.model.Mongo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MongoServiceImpl implements MongoService {
    @Autowired
    private MongoDao mongoDao;

    @Override
    public void save(Mongo mongo) {
        mongoDao.save(mongo);
    }

    @Override
    public Optional<Mongo> findOne(String id) {
        return Optional.of(mongoDao.findById(id).get());
    }

    @Override
    public List<Mongo> findByNameContains(String name) {
        return mongoDao.findByNameContains(name);
    }
}
