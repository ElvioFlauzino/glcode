package com.aj2lab01_02;


/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 */
class TestaAgencia {

	public static void main(String[] args) {

		//teste teste
		
		// Criacao da agencia
		Agencia a = new Agencia();
		a.numero = "abc123";
		a.banco = 123;

		a.imprimeDados();

		// Inicializacao da agencia
		a.inicializaAgencia("def1234", 456);
		
		// Impressao dos dados da agencia
		a.imprimeDados();
		
	}
}