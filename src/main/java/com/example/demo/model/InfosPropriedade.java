package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class InfosPropriedade {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  private String nomePropriedade;

  public InfosPropriedade(long id, String nomePropriedade) {
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
