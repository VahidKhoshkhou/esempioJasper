package it.alfasoft.vahid.dto;

import java.io.Serializable;

public class Cliente implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nome;
	private String cognome;
	
	public Cliente() {
	
	}
	
	public Cliente(String nome, String cognome) {
		
		this.nome = nome;
		this.cognome = cognome;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	

}
