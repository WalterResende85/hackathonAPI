package com.stefanini.concurso.model;


import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;


@Entity
public class ConcursoCandidato {
	
	@EmbeddedId
	private ConcursoCandidatoKey concursoCandidatoKey;
	@Column(name = "NOTA")
	private Double nota;

	public ConcursoCandidato() {

	}

	public ConcursoCandidato(Double nota) {
		super();
		this.nota = nota;
	}

	public Double getNota() {
		return nota;
	}

	public void setNota(Double nota) {
		this.nota = nota;
	}

}
