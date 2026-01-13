package com.ceva.javapersistence.springdatajpa.repositories;

import com.ceva.javapersistence.springdatajpa.model.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Repositorio para el entidad User
 */
public interface UserRepository extends CrudRepository<User, Long> {
}
