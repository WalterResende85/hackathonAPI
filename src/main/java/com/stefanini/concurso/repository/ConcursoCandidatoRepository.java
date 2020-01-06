package com.stefanini.concurso.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stefanini.concurso.model.ConcursoCandidato;

@Repository
public interface ConcursoCandidatoRepository extends JpaRepository<ConcursoCandidato, Long> {

}
