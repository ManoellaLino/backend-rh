package br.chronos.rh.justificativaponto.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import br.chronos.rh.justificativaponto.service.JustificativaPontoService;


@RestController
@RequestMapping ("/justificativaPonto/justificativa-ponto")
public class JustificativaPontoController {
	
	
	
	@Autowired
	private JustificativaPontoService service;
}
