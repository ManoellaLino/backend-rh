package br.chronos.rh.justificativaponto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import br.chronos.rh.justificativaponto.entity.JustificativaPonto;

@Repository
public interface JustificativaPontoRepository  extends JpaRepository <JustificativaPonto, Long>, JpaSpecificationExecutor <JustificativaPonto>{
	
}
