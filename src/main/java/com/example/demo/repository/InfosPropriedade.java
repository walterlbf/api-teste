package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InfosPropriedade extends JpaRepository<InfosPropriedade, Long> {
}
