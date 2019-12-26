package com.stefanini.concurso.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stefanini.concurso.model.Candidato;
import com.stefanini.concurso.service.CandidatoService;

@RequestMapping("/candidatos")
@RestController
public class CandidatoController {

	@Autowired
	CandidatoService candidatoService;
	
	
	@PostMapping
	public ResponseEntity<Candidato> salvar(@RequestBody Candidato c) {
		Candidato candidato = candidatoService.salvar(c);
		return new ResponseEntity<>(candidato, HttpStatus.CREATED);
	}

	@PutMapping
	public void atualizar(@RequestBody Candidato candidato) {
		candidatoService.salvar(candidato);
	}

	@GetMapping("/{id}")
	public Candidato buscar(@PathVariable Long id) {
		return candidatoService.buscar(id);
	}

	@GetMapping
	public Iterable<Candidato> buscarTodos() {
		return candidatoService.buscarTodos();
	}

	@DeleteMapping("/{id}")
	public void excluir(@PathVariable Long id) {
		candidatoService.deletar(id);
	
	}
	

}
