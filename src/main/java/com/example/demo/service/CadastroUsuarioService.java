package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.CadastroUsuario;
import com.example.demo.repository.CadastroUsuarioRepository;

@Service
public class CadastroUsuarioService {
  @Autowired
  private CadastroUsuarioRepository repository;

  public List<CadastroUsuario> FindAll() {

    List<CadastroUsuario> usuarios = repository.findAll();

    return usuarios;
  }

}
