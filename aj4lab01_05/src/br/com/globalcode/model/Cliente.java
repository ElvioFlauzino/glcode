package br.com.globalcode.model;

public class Cliente {
	
	private String nome;
	private String telefone;
	private String cpf;
	private int id;

	/**
	 * @param nome
	 *            Nome do cliente
	 * @param telefone
	 *            Telefone do cliente
	 * @param cpf
	 *            CPF do cliente
	 * @param id
	 *            ID do cliente
	 */
	public Cliente(String nome, String telefone, String cpf, int id) {
		this(nome, telefone, cpf);
		this.id = id;
	}

	/**
	 * Este construtor podera ser utilizado quando o id do cliente precisar ser
	 * atribuido depois, como por exemplo quando e necessario criar o cliente
	 * para salvar no banco de dados, onde o id e gerado automaticamente.
	 * 
	 * @param nome
	 *            Nome do cliente
	 * @param telefone
	 *            Telefone do cliente
	 * @param cpf
	 *            CPF do cliente
	 * 
	 */
	public Cliente(String nome, String telefone, String cpf) {
		this.nome = nome;
		this.telefone = telefone;
		this.cpf = cpf;
	}

	/**
	 * 
	 * @return CPF do Cliente
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * @return ID do cliente
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return Nome do cliente
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @return Telefone do cliente
	 */
	public String getTelefone() {
		return telefone;
	}

	/**
	 * @param o
	 *            parametro cpf sera atribuido ao cpf do cliente
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	/**
	 * @param o
	 *            parametro id sera atribuido ao id do cliente
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @param o
	 *            parametro nome sera atribuido ao nome do cliente
	 */
	public void setNome(String nome) {
		nome = this.nome;
	}

	/**
	 * @param o
	 *            parametro telefone sera atribuido ao telefone do cliente
	 */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String toString() {
		String cliente = " ID [" + this.id + "]";
		cliente += this.nome + "\t CPF (" + this.cpf + " ) \t";
		cliente += "- Tel: {" + this.telefone + "}";
		return cliente;
	}

	public boolean equals(Object o) {
		if (o instanceof Cliente) {
			Cliente cli = (Cliente) o;
			if (cli.getCpf().equals(this.cpf)) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

}
