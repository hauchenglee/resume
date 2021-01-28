package com.doubai.resume.dao.mysql;

import com.doubai.resume.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserDao extends JpaRepository<User, String> {

    Optional<User> findById(String id);

    @Query("SELECT u FROM User u WHERE u.user_account = :account")
    Optional<User> findByUser_account(@Param("account") String account);
}
