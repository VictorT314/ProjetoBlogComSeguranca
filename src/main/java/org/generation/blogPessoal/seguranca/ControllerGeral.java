package org.generation.blogPessoal.seguranca;

import org.generation.blogPessoal.model.Tema;
import org.generation.blogPessoal.repository.TemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ControllerGeral {

	@Autowired
	private TemaRepository repository;
	
	@GetMapping("/")
	public String login() {
		return "index";
	}
	
	@RequestMapping(value="/cadastrarTema", method=RequestMethod.GET)
	public String form() {
		return "formTema";
	}
	
	@PostMapping(value="/cadastrarTema")
	public String form(Tema tema) {
		repository.save(tema);
		return "redirect:/cadastrarTema";
	}
}
