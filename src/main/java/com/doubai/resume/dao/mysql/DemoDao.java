package com.doubai.resume.dao.mysql;

import com.doubai.resume.model.mysql.Demo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DemoDao extends JpaRepository<Demo, String> {
}
