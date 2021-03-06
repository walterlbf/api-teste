package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.model.CadastroUsuario;

@Repository
public interface CadastroUsuarioRepository extends JpaRepository<CadastroUsuario, Long> {

}
