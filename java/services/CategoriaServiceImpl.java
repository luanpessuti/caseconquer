package services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import Repository.CategoriaRepository;
import entities.Categoria;


@Service
public class CategoriaServiceImpl implements CategoriaService {

	private CategoriaRepository categoriaRepository;
	
	
	@Override
	public void salvar(Categoria categoria) {
		// TODO Auto-generated method stub
		
		this.categoriaRepository.save(categoria);
	}

	@Override
	public Categoria buscarPorId(Long id) {
		// TODO Auto-generated method stub
		
		Optional<Categoria> o =	this.categoriaRepository.findById(id);
		
		return o.get();
	}

	@Override
	public List<Categoria> listarTodas() {
		// TODO Auto-generated method stub
		
		List<Categoria> categorias = new ArrayList<>();
		
		Iterator<Categoria> iterator = this.categoriaRepository.findAll().iterator();
	
		while(iterator.hasNext()) {
			
			categorias.add(iterator.next());
		}
		
		return categorias;
	}

	@Override
	public void removerPorId(Long id) {
		// TODO Auto-generated method stub
		
		this.categoriaRepository.deleteById(id);
	}

	public CategoriaRepository getCategoriaRepository() {
		return categoriaRepository;
	}

}
