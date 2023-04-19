package com.eccomercebelajar.eccomerceapi.repositories;

import com.eccomercebelajar.eccomerceapi.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, String> {
}
