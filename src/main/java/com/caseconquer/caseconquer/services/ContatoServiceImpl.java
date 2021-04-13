package com.caseconquer.caseconquer.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caseconquer.caseconquer.Repository.ContatoRepository;
import com.caseconquer.caseconquer.entities.Contato;

@Service
public class ContatoServiceImpl implements ContatoService {

	@Autowired
	private ContatoRepository contatoRepository;
	
	
	public ContatoServiceImpl(ContatoRepository contatoRepository) {
		this.contatoRepository = contatoRepository;
	}

	
	@Override
	public void salvar(Contato contato) {

		this.contatoRepository.save(contato);
	}

	@Override
	public Contato buscarPorId(Long id) {
	
		Optional<Contato> o = this.contatoRepository.findById(id);
		
		return o.get();
}

	@Override
	public List<Contato> listarTodas() {
		
		List<Contato> contatos = new ArrayList<>();
		
		//Iterator<Contato> iterator = this.contatoRepository.findAll().iterator();
		 
		/*
		 *  loop infinito. No iterator, se você não dá um .next() nele, ele fica pra sempre dizendo que tem hasNext().
		 *  
		 *  Ou seja, hasNext() é o método que diz que tem um proximo, enquanto você não chamar o next() você não consome
		 *  o próximo e hasNext() sempre é Boolean.TRUE 
		 */
	//	while(iterator.hasNext()) {
	//}
	
	return contatos;
}

	@Override
	public void removerPorId(Long id) {

		this.contatoRepository.deleteById(id);
	}

			
}
