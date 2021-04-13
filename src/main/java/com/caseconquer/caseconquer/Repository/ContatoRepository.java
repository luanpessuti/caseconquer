package com.caseconquer.caseconquer.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.caseconquer.caseconquer.entities.Contato;

@Repository
public interface ContatoRepository extends CrudRepository<Contato, Long>{
	
}
