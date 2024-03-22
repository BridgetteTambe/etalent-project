package com.enviro.assessment.grad001.bridgettetambe.Repositories;

import com.enviro.assessment.grad001.bridgettetambe.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
