package com.medicalrepository.v1.repository;

import com.medicalrepository.v1.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User,Long> {

    public List<User> findAll();
    public User findAllById (Long id);
    public User findAllByUserName(String user);
}
