package com.example.demo.repository;

import javax.persistence.Entity;
import org.springframework.data.jpa.repository.JpaRepository;

@Entity
public interface Laboratorio extends JpaRepository<Laboratorio, Long> {

}
