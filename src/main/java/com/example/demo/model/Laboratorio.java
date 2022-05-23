package com.example.demo.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Laboratorio {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  private String nomePropriedade;

  public Laboratorio(long id, String nomePropriedade) {
    super();
    this.id = id;
    this.nomePropriedade = nomePropriedade;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getNomePropriedade() {
    return nomePropriedade;
  }

  public void setNomePropriedade(String nomePropriedade) {
    this.nomePropriedade = nomePropriedade;
  }
}
