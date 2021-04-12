package Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import entities.Contato;

@Repository
public interface ContatoRepository extends CrudRepository<Contato, Long>{
	
}
