package com.example.BSMS.Repo;


import com.example.BSMS.Entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface UserRepo extends JpaRepository<Users, Integer> {


    boolean existsByUsername(String username);

    boolean existsByEmail(String email);


    Users findByUsername(String username);
}
