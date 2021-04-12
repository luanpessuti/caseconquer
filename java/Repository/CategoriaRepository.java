package Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import entities.Categoria;

@Repository
public interface CategoriaRepository extends CrudRepository<Categoria, Long>{

}
