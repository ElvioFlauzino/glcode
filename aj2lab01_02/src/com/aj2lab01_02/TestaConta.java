package com.aj2lab01_02;

/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 */
class TestaConta {

	public static void main(String[] args) {
		// Criacao da conta
		Conta c = new Conta();
		// Inicializacao da conta
		c.inicializaConta(4000, "abc345", "rhedson", 44, 50);
		// Impressao dos dados da conta
		c.imprimeDados();
		// Saque da conta ok
		c.saque(500);
		// Saque da conta NEGADO
		c.saque(5000);
		// Impressao dos dados da conta
		c.imprimeDados();
		// Deposito em conta Ok
		c.deposito(750);

		// Impressao dos dados da conta em quest‹o
		c.imprimeDados();

		c.saque(400);
		c.imprimeDados();
	}
}
