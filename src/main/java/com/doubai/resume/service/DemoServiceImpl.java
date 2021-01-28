package com.doubai.resume.service;

import com.doubai.resume.dao.mysql.DemoDao;
import com.doubai.resume.model.mysql.Demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Primary
public class DemoServiceImpl implements DemoService {

    @Autowired
    private DemoDao DemoMySqlDao;

    @Override
    public Optional<Demo> findById(String id) {
        return DemoMySqlDao.findById(id);
    }

    @Override
    public void save(Demo demo) {
        DemoMySqlDao.save(demo);
    }
}
