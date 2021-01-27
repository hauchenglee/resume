package com.doubai.resume.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "user")
@Data
public class User {

    @Id
    private String user_id;

    @Column(nullable = false, unique = true)
    @NotNull
    private String user_account;

    @Column(nullable = false)
    @NotNull
    private String user_password;

    @Column(nullable = false)
    @NotNull
    private String user_name;

    @Column(nullable = false, unique = true)
    @NotNull
    @Email
    private String user_email;
}
