package com.algaworks.notificador;

public class Sms implements Notificador {

	@Override
	public void notificar(Mensagem mensagem) {
		System.out.println("Mensagem por SMS: " + mensagem);
	}
}
