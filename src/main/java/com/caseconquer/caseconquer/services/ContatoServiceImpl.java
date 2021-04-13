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
		 *  loop infinito. No iterator, se voc� n�o d� um .next() nele, ele fica pra sempre dizendo que tem hasNext().
		 *  
		 *  Ou seja, hasNext() � o m�todo que diz que tem um proximo, enquanto voc� n�o chamar o next() voc� n�o consome
		 *  o pr�ximo e hasNext() sempre � Boolean.TRUE 
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
