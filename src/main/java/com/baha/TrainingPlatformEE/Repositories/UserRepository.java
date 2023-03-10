package com.baha.TrainingPlatformEE.Repositories;

import com.baha.TrainingPlatformEE.DTOs.UserDTO;
import com.baha.TrainingPlatformEE.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Integer>  {
    //extends JpaRepository<Integer,User>
    //JpaRepository has his own Rules here !!! :/
    Optional<User> findByFirstName(String name) ;
}
