package br.chronos.rh.justificativaponto.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.chronos.rh.config.query.Request;
import br.chronos.rh.justificativaponto.entity.JustificativaPonto;
import br.chronos.rh.justificativaponto.service.JustificativaPontoService;


@RestController
@RequestMapping ("/rh/justificativa-ponto")
public class JustificativaPontoController {
	
	
	@Autowired
	private JustificativaPontoService service;
	
	
	
	@PostMapping(value = "/add")
	public ResponseEntity<JustificativaPonto> save(@RequestBody JustificativaPonto jp) {
		service.save(jp);
		return ResponseEntity.created(ServletUriComponentsBuilder.fromCurrentContextPath().path("/{id}")
				.buildAndExpand(jp.getID()).toUri()).body(jp);
	}

	
	
	
	@PutMapping(value = "/update")
	public ResponseEntity<JustificativaPonto> update(@RequestBody JustificativaPonto jp) {
		service.save(jp);
		return ResponseEntity.created(ServletUriComponentsBuilder.fromCurrentContextPath().path("/{id}")
				.buildAndExpand(jp.getID()).toUri()).body(jp);
	}

	
	@PostMapping(value = "/find")
	public ResponseEntity<Page<JustificativaPonto>> findAll(@RequestBody Request request) {
		return ResponseEntity.ok(service.findAll(request));
	}

	
	
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<JustificativaPonto> findOne(@PathVariable long id) {
		return ResponseEntity.ok(service.findById(id));
	}
	
}
