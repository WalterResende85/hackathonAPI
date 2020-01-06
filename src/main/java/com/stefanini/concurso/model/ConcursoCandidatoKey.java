package com.stefanini.concurso.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ConcursoCandidatoKey implements Serializable {

	private static final long serialVersionUID = 1L;
	@Column(name = "ID_CANDIDATO")
	private Long id_candidato;
	@Column(name = "ID_CONCURSO")
	private Long id_Concurso;

	public ConcursoCandidatoKey() {

	}

	public ConcursoCandidatoKey(Long id_candidato, Long id_Concurso) {
		super();
		this.id_candidato = id_candidato;
		this.id_Concurso = id_Concurso;
	}

	public Long getId_candidato() {
		return id_candidato;
	}

	public void setId_candidato(Long id_candidato) {
		this.id_candidato = id_candidato;
	}

	public Long getId_Concurso() {
		return id_Concurso;
	}

	public void setId_Concurso(Long id_Concurso) {
		this.id_Concurso = id_Concurso;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_Concurso == null) ? 0 : id_Concurso.hashCode());
		result = prime * result + ((id_candidato == null) ? 0 : id_candidato.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ConcursoCandidatoKey other = (ConcursoCandidatoKey) obj;
		if (id_Concurso == null) {
			if (other.id_Concurso != null)
				return false;
		} else if (!id_Concurso.equals(other.id_Concurso))
			return false;
		if (id_candidato == null) {
			if (other.id_candidato != null)
				return false;
		} else if (!id_candidato.equals(other.id_candidato))
			return false;
		return true;
	}
	

}
