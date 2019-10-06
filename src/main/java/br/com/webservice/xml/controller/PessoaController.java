package br.com.webservice.xml.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.webservice.xml.model.Usuario;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {
	
	@GetMapping(value="/{id}", produces=MediaType.APPLICATION_XML_VALUE)
	public Usuario getPessoaById(@PathVariable Integer id) {
		
		Usuario usuario = new Usuario();
		usuario.setId(1);
		usuario.setNome("Fulano da Silva");
		usuario.setEmail("fulano@email.com");
		usuario.setStatus("OK");
		
		if (id == 1) {
			
			usuario.setId(1);
			usuario.setNome("Fulano da Silva");
			usuario.setEmail("fulano@email.com");
			usuario.setStatus("OK");
			
			return usuario;
			
		} else {
			
			usuario.setId(null);
			usuario.setNome("");
			usuario.setEmail("");
			usuario.setStatus("FAIL");
			
			return usuario;
			
		}
		
//		<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
//		<usuario><email></email><id></id><nome></nome><status>FAIL</status></usuario>
		
		
	}
	
}
