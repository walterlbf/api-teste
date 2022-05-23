package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.model.InfosPropriedade;

@Repository
public interface InfosPropriedadeRepository extends JpaRepository<InfosPropriedade, Long> {
}
