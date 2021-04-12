package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import services.ContatoService;

@Controller
@RequestMapping("/contato")
public class ContatoController {
	
	private ContatoService contatoService;public ContatoController() {
		// TODO Auto-generated constructor stub
	}
	
	@GetMapping("/listar")
	public String listar(Model model) {
		
		model.addAllAttributes(contatoService.listarTodas());
		
		return "contato/listar";
	
	}

	public ContatoService getContatoService() {
		return contatoService;
	}

	public void setContatoService(ContatoService contatoService) {
		this.contatoService = contatoService;
	}

}
