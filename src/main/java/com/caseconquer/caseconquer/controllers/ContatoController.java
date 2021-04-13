package com.caseconquer.caseconquer.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.caseconquer.caseconquer.services.ContatoService;

@Controller
@RequestMapping("/contato")
public class ContatoController {
	
	private ContatoService contatoService;
	
	public ContatoController(ContatoService contatoService) {
		this.contatoService = contatoService;
	}
	
	@GetMapping("/listar")
	public String listar(Model model) {
		
		//voce precisa dar um nome para o que voce coloca no Model, fica mais facil de achar e manipular na tela.
		model.addAttribute("contatos", contatoService.listarTodas());
		
		// esse método da erro porque ele não encontra uma página chamada contato/listar
		// mudei o arquivo html de lugar
		return "lista.html";
	
	}

	public ContatoService getContatoService() {
		return contatoService;
	}

	public void setContatoService(ContatoService contatoService) {
		this.contatoService = contatoService;
	}

}
