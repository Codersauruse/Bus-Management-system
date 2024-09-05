package com.example.BSMS.Repo;


import com.example.BSMS.Entity.Busses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface BusRepo extends JpaRepository<Busses,Integer> {
}
