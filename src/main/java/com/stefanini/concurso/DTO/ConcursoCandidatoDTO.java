package com.stefanini.concurso.DTO;

import com.stefanini.concurso.model.ConcursoCandidato;

public class ConcursoCandidatoDTO {
	private Double nota;

	public ConcursoCandidato tansformarParaConcursoCandidatoDTO() {
		return new ConcursoCandidato(nota);
	}

	public Double getNota() {
		return nota;
	}

	public void setNota(Double nota) {
		this.nota = nota;
	}

}
