package com.example.demo.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

  @GetMapping("/{id}")
  public ResponseEntity<CadastroUsuario> findById(@PathVariable("id") long id) {
    try {
      Optional<CadastroUsuario> usuario = this.usuarioService.findById(id);
      if (usuario.isPresent()) {
        return new ResponseEntity<>(usuario.get(), HttpStatus.OK);
      }
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    } catch (Exception e) {
      // TODO: handle exception
      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }

  @PostMapping
  public ResponseEntity<CadastroUsuario> save(@RequestBody CadastroUsuario usuario) {
    try {
      CadastroUsuario usuarioNovo = this.usuarioService.addUsuario(usuario);

      return new ResponseEntity<>(usuarioNovo, HttpStatus.CREATED);
    } catch (Exception e) {
      // TODO: handle exception
      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<CadastroUsuario> remover(@PathVariable Long id) {
    try {
      this.usuarioService.deleteById(id);
      return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    } catch (Exception e) {
      // TODO: handle exception
      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

  }

}
