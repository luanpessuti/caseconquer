package services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import Repository.ContatoRepository;
import entities.Contato;

@Service
public class ContatoServiceImpl implements ContatoService {

	private ContatoRepository contatoRepository;
	
	public ContatoRepository getContatoRepository() {
		return contatoRepository;
	}
	
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
		
		Iterator<Contato> iterator = this.contatoRepository.findAll().iterator();
		
		while(iterator.hasNext()) {
	}
	
	return contatos;
}

	@Override
	public void removerPorId(Long id) {

		this.contatoRepository.deleteById(id);
	}

			
}
