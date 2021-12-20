package com.gl.CollegeFest.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.gl.CollegeFest.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User getByUsername(String username);

}