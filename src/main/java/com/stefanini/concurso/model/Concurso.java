package com.stefanini.concurso.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Concurso implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_CONCURSO")
	private Long idConcurso;
	@Column(name = "NOME")
	private String nome;
	@Column(name = "QUANTIDADE_VAGAS")
	private Integer quantidadeVagas;

	public Concurso() {

	}

	public Concurso(String nome, Integer quantidadeVagas) {
		super();
		this.nome = nome;
		this.quantidadeVagas = quantidadeVagas;
	}
	
	

	public Long getIdConcurso() {
		return idConcurso;
	}

	public void setIdConcurso(Long idConcurso) {
		this.idConcurso = idConcurso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getQuantidadeVagas() {
		return quantidadeVagas;
	}

	public void setQuantidadeVagas(Integer quantidadeVagas) {
		this.quantidadeVagas = quantidadeVagas;
	}

	

	

}
