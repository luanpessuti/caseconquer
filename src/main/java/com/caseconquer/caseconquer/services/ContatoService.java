package com.caseconquer.caseconquer.services;

import java.util.List;

import com.caseconquer.caseconquer.entities.Contato;


public interface ContatoService {

	public void salvar(Contato contato);
	
	public Contato buscarPorId(Long id);
	
	public List<Contato> listarTodas();
	
	public void removerPorId(Long id);
	
}
