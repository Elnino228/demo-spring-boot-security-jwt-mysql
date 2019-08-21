package com.example.demo.repository;

import com.example.demo.model.DAOUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<DAOUser,Long> {
    DAOUser findByUsername(String username);
}
