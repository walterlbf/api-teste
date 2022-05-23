package com.example.demo.model;

import java.time.Instant;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class CadastroUsuario {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String nome;

  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'",
      timezone = "GMT")
  private Instant dataInicial;
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'",
      timezone = "GMT")
  private Instant dataFinal;
  @OneToOne
  private InfosPropriedade infosPropriedade;
  private String cnpj;
  @OneToOne
  private Laboratorio laboratorio;
  private String observacoes;

  public Long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Instant getDataInicial() {
    return dataInicial;
  }

  public void setDataInicial(Instant dataInicial) {
    this.dataInicial = dataInicial;
  }

  public Instant getDataFinal() {
    return dataFinal;
  }

  public void setDataFinal(Instant dataFinal) {
    this.dataFinal = dataFinal;
  }

  public InfosPropriedade getInfosPropriedade() {
    return infosPropriedade;
  }

  public void setInfosPropriedade(InfosPropriedade infosPropriedade) {
    this.infosPropriedade = infosPropriedade;
  }

  public String getCnpj() {
    return cnpj;
  }

  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

  public Laboratorio getLaboratorio() {
    return laboratorio;
  }

  public void setLaboratorio(Laboratorio laboratorio) {
    this.laboratorio = laboratorio;
  }

  public String getObservacoes() {
    return observacoes;
  }

  public void setObservacoes(String observacoes) {
    this.observacoes = observacoes;
  }

}
