package com.enviro.assessment.grad001.bridgettetambe.services;

import com.enviro.assessment.grad001.bridgettetambe.models.User;

import java.util.List;

public interface UserService {

    User uploadData(User user) throws Exception;

    User findById(Long id) throws Exception;

    List<User> findAll() throws Exception;
}
