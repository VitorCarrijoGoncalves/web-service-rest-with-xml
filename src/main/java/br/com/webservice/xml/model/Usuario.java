package br.com.webservice.xml.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "usuario")
public class Usuario {
	
	@JacksonXmlProperty
	private Integer id;
	
	@JacksonXmlProperty
	private String nome;
	
	@JacksonXmlProperty
	private String email;
	
	@JacksonXmlProperty
	private String status;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String isStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Usuario {id=" + id + ", nome=" + nome + ", email=" + email + ", status=" + status + "}";
	}
	
}
