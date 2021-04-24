package com.medicalrepository.v1.services;

import com.medicalrepository.v1.entity.User;

import java.util.List;

public interface UserService {

    public List<User> findAll();
    public void save (User cuenta);
    public void delete(Long id);
    public User findOne(Long id);
    public User finOneUser(String user);

}
