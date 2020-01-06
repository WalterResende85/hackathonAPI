package com.stefanini.concurso.DTO;

import com.stefanini.concurso.model.Concurso;

public class ConcursoDTO {
	private String nome;
	private Integer quantidadeVagas;
	

	public Concurso transformarParaConcursoDTO() {
		return new Concurso(nome, quantidadeVagas);
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
