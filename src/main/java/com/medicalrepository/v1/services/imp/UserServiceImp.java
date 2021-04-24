package com.medicalrepository.v1.services.imp;

import com.medicalrepository.v1.entity.User;
import com.medicalrepository.v1.repository.UserRepository;
import com.medicalrepository.v1.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

   @Autowired
   private UserRepository userRepository;
    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public void save(User user) {userRepository.save(user);}

    @Override
    public void delete(Long id) {
        User user = userRepository.findAllById(id);
        userRepository.delete(user);}

    @Override
    public User findOne(Long id) {
        return userRepository.findAllById(id);
    }

    @Override
    public User finOneUser(String user) {
        return null;
    }
}
