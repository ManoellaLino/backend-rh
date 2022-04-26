package br.chronos.rh.justificativaponto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.cassandra.CassandraProperties.Request;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import br.chronos.rh.justificativaponto.entity.JustificativaPonto;
import br.chronos.rh.justificativaponto.repository.JustificativaPontoRepository;

@Service
public class JustificativaPontoService {
	
	
	
	@Autowired
	private JustificativaPontoRepository repository;
	
	
	 public JustificativaPonto save (JustificativaPonto justificativaPonto) {
		return repository.save(justificativaPonto);
	 }
	
	
	
	 public JustificativaPonto findById (Long id) {
		return repository.getById(id).orElse(null);
	 }
	
	
	
	 public Page <JustificativaPonto> findAll (Request request) {
		return repository.findAll(new GerenicSpesification<>(request.getList()), request.getPageable());
	 }

}
