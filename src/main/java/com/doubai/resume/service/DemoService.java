package com.doubai.resume.service;


import com.doubai.resume.model.mysql.Demo;

import java.util.Optional;

public interface DemoService {

    Optional<Demo> findById(String id);

    void save(Demo demo);
}
