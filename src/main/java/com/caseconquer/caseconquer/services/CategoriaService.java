package com.caseconquer.caseconquer.services;

import java.util.List;

import com.caseconquer.caseconquer.entities.Categoria;

public interface CategoriaService {	
	
	public void salvar(Categoria categoria);
	
	public Categoria buscarPorId(Long id);
	
	public List<Categoria> listarTodas();
	
	public void removerPorId(Long id);

}
