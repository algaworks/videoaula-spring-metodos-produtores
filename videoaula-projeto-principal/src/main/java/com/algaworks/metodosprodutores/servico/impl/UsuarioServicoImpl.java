package com.algaworks.metodosprodutores.servico.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.algaworks.metodosprodutores.model.Usuario;
import com.algaworks.metodosprodutores.servico.UsuarioServico;
import com.algaworks.notificador.Mensagem;
import com.algaworks.notificador.Notificador;

@Service
public class UsuarioServicoImpl implements UsuarioServico {
	
	@Autowired
	private Notificador notificador;
	
	@Override
	public void cadastrar(Usuario usuario) {
		System.out.println("Novo usuário: " + usuario);
		
		notificador.notificar(new Mensagem("Bem vindo!", "Olá!"));
	}
}