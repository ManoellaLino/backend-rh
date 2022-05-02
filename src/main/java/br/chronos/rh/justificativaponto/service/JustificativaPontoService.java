package br.chronos.rh.justificativaponto.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import br.chronos.rh.config.query.GenericSpesification;
import br.chronos.rh.config.query.Request;
import br.chronos.rh.justificativaponto.entity.JustificativaPonto;
import br.chronos.rh.justificativaponto.repository.JustificativaPontoRepository;

@Service
public class JustificativaPontoService {
	
	
	
	@Autowired
	private JustificativaPontoRepository repository;
	
	
	 public JustificativaPonto save (JustificativaPonto justificativaPonto) {
		 
		 
		      //salva a data e hora em que foi feito o registro
		      if (justificativaPonto.getID() == null) {
			       justificativaPonto.setDataEntrega(LocalDateTime.now());
		      }
		      
		      
		return repository.save(justificativaPonto);
	 }
	
	
	
	 public JustificativaPonto findById (Long id) {
		return repository.getById(id).orElse(null);
	 }
	
	
	
	 public Page <JustificativaPonto> findAll (Request request) {
		return repository.findAll(new GenericSpesification<>(request.getList()), request.getPageable());
	 }
}
