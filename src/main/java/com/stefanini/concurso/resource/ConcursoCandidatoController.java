package com.stefanini.concurso.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stefanini.concurso.DTO.ConcursoCandidatoDTO;
import com.stefanini.concurso.model.ConcursoCandidatoKey;
import com.stefanini.concurso.service.ConcursoCandidatoService;

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/concursoCandidato")
@RestController
public class ConcursoCandidatoController {

	@Autowired
	ConcursoCandidatoService concursoCandidatoService;

	@PostMapping
	public ConcursoCandidatoDTO salvar(@RequestBody ConcursoCandidatoDTO concursoCandidatoDTO) {
		return concursoCandidatoService.salvar(concursoCandidatoDTO);
	}
	
	@GetMapping("/{idCandidato}/{idConcurso}")
	public ConcursoCandidatoDTO buscar(@PathVariable Long idCandidato, @PathVariable Long idConcurso) {
		return concursoCandidatoService.buscar(new ConcursoCandidatoKey(idCandidato, idConcurso));
	}

	@GetMapping
	public Iterable<ConcursoCandidatoDTO> buscarTodos() {
		return concursoCandidatoService.buscarTodos();
	}

	@DeleteMapping("/{idCandidato}/{idConcurso}")
	public void deletar(@PathVariable Long idCandidato, @PathVariable Long idConcurso) {
		concursoCandidatoService.deletar(new ConcursoCandidatoKey(idCandidato, idConcurso));

	}
	

}
