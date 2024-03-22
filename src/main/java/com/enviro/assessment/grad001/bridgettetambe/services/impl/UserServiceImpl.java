package com.enviro.assessment.grad001.bridgettetambe.services.impl;

import com.enviro.assessment.grad001.bridgettetambe.Repositories.UserRepository;
import com.enviro.assessment.grad001.bridgettetambe.models.User;
import com.enviro.assessment.grad001.bridgettetambe.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Component
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;


    @Override
    public User uploadData(User user) throws Exception {
        return userRepository.save(user);
    }

    @Override
    public User findById(Long id) throws Exception {
        Optional<User> findById = userRepository.findById(id);
        return findById.orElse(null) ;
    }

    @Override
    public List<User> findAll() throws Exception {
        return userRepository.findAll();
    }
}
