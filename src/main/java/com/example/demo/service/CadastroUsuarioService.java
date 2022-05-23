package com.example.demo.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.CadastroUsuario;
import com.example.demo.repository.CadastroUsuarioRepository;

@Service
public class CadastroUsuarioService {
  @Autowired
  private CadastroUsuarioRepository repository;

  public List<CadastroUsuario> findAll() {

    List<CadastroUsuario> usuarios = this.repository.findAll();

    return usuarios;
  }

  public Optional<CadastroUsuario> findById(long id) {

    Optional<CadastroUsuario> usuario = this.repository.findById(id);

    return usuario;

  }

  public CadastroUsuario addUsuario(CadastroUsuario usuario) {
    return this.repository.save(usuario);
  }
}
