package com.stefanini.concurso.resource;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.stefanini.concurso.DTO.ConcursoCandidatoDTO;

import com.stefanini.concurso.model.ConcursoCandidato;
import com.stefanini.concurso.service.ConcursoCandidatoService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ConcursoCandidatoController {

	@Autowired
	ConcursoCandidatoService concursoCandidatoService;

	@PostMapping
	public ResponseEntity<ConcursoCandidato> salvar(@RequestBody ConcursoCandidatoDTO dto) {
		ConcursoCandidato concursoCandidato = concursoCandidatoService.salvar(dto.tansformarParaConcursoCandidatoDTO());
		return new ResponseEntity<>(concursoCandidato, HttpStatus.CREATED);
	}

	@PutMapping("/{id}")
	public ResponseEntity<ConcursoCandidato> atualizar(@PathVariable Long id, @RequestBody ConcursoCandidatoDTO dto) {
		ConcursoCandidato existente = concursoCandidatoService.buscar(id);
		if (existente == null) {
			return ResponseEntity.notFound().build();
		}
		BeanUtils.copyProperties(dto.tansformarParaConcursoCandidatoDTO(), existente, "id");
		existente = concursoCandidatoService.salvar(existente);
		return ResponseEntity.ok(existente);
	}

	@GetMapping("/{id}")
	public ConcursoCandidato buscar(@PathVariable Long id) {
		return concursoCandidatoService.buscar(id);
	}

	@GetMapping
	public Iterable<ConcursoCandidato> buscarTodos() {
		return concursoCandidatoService.buscarTodos();
	}

	@DeleteMapping("/{id}")
	public void excluir(@PathVariable Long id) {
		concursoCandidatoService.deletar(id);

	}

}
