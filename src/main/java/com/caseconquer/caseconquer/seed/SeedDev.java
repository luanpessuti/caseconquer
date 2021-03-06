package com.caseconquer.caseconquer.seed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.caseconquer.caseconquer.Repository.CategoriaRepository;
import com.caseconquer.caseconquer.Repository.ContatoRepository;
import com.caseconquer.caseconquer.entities.Categoria;
import com.caseconquer.caseconquer.entities.Contato;

/**
 * Ficou bacana, boa ideia
 * @author Leonardo A. Alcantara
 *
 */
@Component
public class SeedDev implements ApplicationListener<ContextRefreshedEvent>{

		@Autowired
		private CategoriaRepository categoriaRepository;
		
		@Autowired
		private ContatoRepository  contatoRepository;
		

		public void InserirDados() {
			
			Categoria categoria1 = new Categoria ();
			categoria1.setDescricao("Aluno");
			
			Categoria categoria2 = new Categoria();
			categoria2.setDescricao("Funcionário");
			
			categoriaRepository.save(categoria1);
			categoriaRepository.save(categoria2);
			
			
			Contato contato1 = new Contato();
			contato1.setNome("Luan Pessuti");
			contato1.setCpf("000.111.222-33");
			contato1.setEmail("luanpessuti@gmail.com");
			contato1.setCategoria(categoria2);
			
			Contato contato2 = new Contato();
			contato2.setNome("Maria Silva");
			contato2.setCpf("333.444.555-66");
			contato2.setEmail("mariasilva@gmail.com");
			contato2.setCategoria(categoria1);
			
			contatoRepository.save(contato1);
			contatoRepository.save(contato2);
		}


		@Override
		public void onApplicationEvent(ContextRefreshedEvent event) {
			// TODO Auto-generated method stub
			InserirDados();
		}
	
}
