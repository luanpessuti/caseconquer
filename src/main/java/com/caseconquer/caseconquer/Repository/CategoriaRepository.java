package com.caseconquer.caseconquer.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.caseconquer.caseconquer.entities.Categoria;

@Repository
public interface CategoriaRepository extends CrudRepository<Categoria, Long>{

}
