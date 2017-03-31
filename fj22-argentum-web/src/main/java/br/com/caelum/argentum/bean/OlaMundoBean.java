package br.com.caelum.argentum.bean;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class OlaMundoBean {
	
	// Variables
	private String mensagem = "Quem e voce?";
	private String nome;
	
	// Getters and Setters
	public String getMensagem() {
		System.out.println("getMensagem");
		return this.mensagem;
	}
	
	public String getNome() {
		System.out.println("getNome");
		return this.nome;
	}
	
	public void setNome(String nome) {
		System.out.println("setNome");
		this.nome = nome;
	}
	
	// Methods
	public void nomeFoiDigitado() {
		System.out.println("nomeFoiDigitado");
		System.out.println("\nChamou o botao");
	}
}
