package br.com.webservice.xml.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.webservice.xml.model.Usuario;

@RestController
@RequestMapping("/usuarios")
public class PessoaController {
	
	@GetMapping(value="/{id}", produces=MediaType.APPLICATION_XML_VALUE)
	public Usuario getUsuarioById(@PathVariable Integer id) {
		
		Usuario usuario = new Usuario();
		
		if (id == 5646) {
			
			usuario.setId(5646);
			usuario.setNome("DUILIO CALAÇA JUNIOR");
			usuario.setEmail("duilio@redeempresarial.com");
			usuario.setStatus("OK");
			
			return usuario;
			
		} else {
			
			usuario.setId(null);
			usuario.setNome("");
			usuario.setEmail("");
			usuario.setStatus("FAIL");
			
			return usuario;
			
		}
		
		
	}
	
}
