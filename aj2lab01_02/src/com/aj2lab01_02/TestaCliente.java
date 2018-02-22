package com.aj2lab01_02;

/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 */
class TestaCliente extends TestaAgencia {

    public static void main(String[] args) {
        // Criacao do cliente
    	Cliente cliente = new Cliente();
    	
        // Inicializacao do cliente
    	cliente.cpf = "123456789-01";
    	cliente.nome = "Elvio Cristiano";
    	
        // Impressao dos dados do cliente
    	cliente.imprimeDados();
    }
}