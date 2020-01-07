package com.stefanini.concurso.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.stefanini.concurso.DTO.ConcursoCandidatoDTO;
import com.stefanini.concurso.model.ConcursoCandidato;
import com.stefanini.concurso.model.ConcursoCandidatoKey;

@Repository
public interface ConcursoCandidatoRepository extends JpaRepository<ConcursoCandidato, ConcursoCandidatoKey> {
	/*
	@Query("SELECT new com.stefanini.concurso.DTO.ConcursoCandidatoDTO("
			+ "Candidato.idCandidato, Candidato.nome, Candidato.cpf, Candidato.cidade,"
			+ "Concurso.idConcurso, Concurso.nome, Concurso.quantidadeVagas,"
			+ "ConcursoCandidato.nota )"
			+" FROM ConcursoCandidato "
			+ "join Candidato "
			+ "join Concurso ")
			*/
	@Query("SELECT new com.stefanini.concurso.DTO.ConcursoCandidatoDTO(ca.idCandidato, ca.nome, ca.cpf, ca.cidade, co.idConcurso, co.nome, co.quantidadeVagas, cc.nota)"
			+ " FROM ConcursoCandidato cc "
			+ "JOIN Candidato ca ON ca.idCandidato = cc.concursoCandidatoKey.idCandidato  "
			+ "JOIN Concurso co ON co.idConcurso = cc.concursoCandidatoKey.idConcurso")
	Iterable<ConcursoCandidatoDTO> buscarTodos();

}
