package services;

import java.util.List;

import entities.Contato;


public interface ContatoService {

	public void salvar(Contato contato);
	
	public Contato buscarPorId(Long id);
	
	public List<Contato> listarTodas();
	
	public void removerPorId(Long id);
	
}
