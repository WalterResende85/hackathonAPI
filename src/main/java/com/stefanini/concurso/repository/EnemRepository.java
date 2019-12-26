package com.stefanini.concurso.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stefanini.concurso.model.Enem;
@Repository
public interface EnemRepository extends JpaRepository<Enem, Long> {

}
