package com.example.demo.model;

import java.time.Instant;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class CadastroUsuario {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String nome;

  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'",
      timezone = "GMT")
  private Instant dataInicial;
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'",
      timezone = "GMT")
  private Instant dataFinal;

  private InfosPropriedade infosPropriedade;
  private String cnpj;
  private Laboratorio laboratorio;
  private String observacoes;
}
