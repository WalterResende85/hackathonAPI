package com.stefanini.concurso.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.stefanini.concurso.model.ConcursoCandidato;
import com.stefanini.concurso.repository.ConcursoCandidatoRepository;

@Service
public class ConcursoCandidatoService {
		
		@Autowired
		ConcursoCandidatoRepository concursoCandidatoRepository;
		
		public ConcursoCandidato salvar(ConcursoCandidato concursoCandidato) {
			return concursoCandidatoRepository.save(concursoCandidato);
		}
		public ConcursoCandidato buscar(Long id) {
			return concursoCandidatoRepository.findById(id).orElse(null);
		}
		
		public Iterable<ConcursoCandidato> buscarTodos() {
			return concursoCandidatoRepository.findAll();
		}

		public void deletar(Long id) {
			concursoCandidatoRepository.deleteById(id);
		}
}
