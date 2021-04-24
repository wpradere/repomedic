package com.medicalrepository.v1.services;

import com.medicalrepository.v1.entity.User;
import com.medicalrepository.v1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {

        User user = userRepository.findAllByUserName (userName);
        if (user == null)
            throw new UsernameNotFoundException(userName);

        return new com.medicalrepository.v1.services.UserDetailsImpl(user);
    }
}
