package br.chronos.rh.justificativa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import br.chronos.rh.justificativa.entity.JustificativaPonto;

@Repository
public interface JustificativaPontoRepository  extends JpaRepository <JustificativaPonto, Long>, JpaSpecificationExecutor <JustificativaPonto>{
	
	
}
