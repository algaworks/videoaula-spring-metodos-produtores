package com.algaworks.metodosprodutores.model;

public class Usuario {
	
	private String nome;
	
	public Usuario(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Usuario [nome=" + nome + "]";
	}
}
