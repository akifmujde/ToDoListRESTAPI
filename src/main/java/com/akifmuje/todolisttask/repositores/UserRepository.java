package com.akifmuje.todolisttask.repositores;


import com.akifmuje.todolisttask.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

    List<User> getIdCountFromToken(@Param("token") String token);
    List<User> getUserFromToken(@Param("token") String token);
}