package services;

import java.util.List;
import entities.Categoria;

public interface CategoriaService {	
	
	public void salvar(Categoria categoria);
	
	public Categoria buscarPorId(Long id);
	
	public List<Categoria> listarTodas();
	
	public void removerPorId(Long id);

}
