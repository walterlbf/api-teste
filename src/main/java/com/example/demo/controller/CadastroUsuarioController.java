package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.CadastroUsuario;
import com.example.demo.service.CadastroUsuarioService;

@RestController
@RequestMapping("/usuarios")
public class CadastroUsuarioController {
  @Autowired
  private CadastroUsuarioService usuarioService;

  @GetMapping
  public ResponseEntity<List<CadastroUsuario>> findAll() {

    try {
      List<CadastroUsuario> usuarios = this.usuarioService.findAll();
      if (usuarios.isEmpty()) {
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
      }
      return new ResponseEntity<>(usuarios, HttpStatus.OK);
    } catch (Exception e) {
      // TODO: handle exception
      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
    }

  }
}
