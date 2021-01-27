package com.doubai.resume.service;

import com.doubai.resume.model.User;

import java.util.Optional;

public interface UserService {

    Optional<User> findById(String id);

    Optional<User> findByUser_account(String account);
}

