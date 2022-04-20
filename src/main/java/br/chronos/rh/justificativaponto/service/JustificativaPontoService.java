package br.chronos.rh.justificativa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import br.chronos.rh.justificativa.entity.JustificativaPonto;
import br.chronos.rh.justificativa.repository.JustificativaPontoRepository;

@Service
public class JustificativaPontoService {
	
	
	@Autowired
	private JustificativaPontoRepository repository;

	
	
	public JustificativaPonto save (JustificativaPonto justificativaPonto) {
		return repository.save(justificativaPonto);
	}
	
	
	public JustificativaPonto findById (Long id) {
		return repository.findById(id).orElse(null);
	}
	
	
	
	public Page <JustificativaPonto> findAll (Request request) {
		return repository.findAll(new GenericSpecification<>(request.getList()), request.getPageable());
	}
}
