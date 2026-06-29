package com.javacompleto.udemycourse.repositories;

import com.javacompleto.udemycourse.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
