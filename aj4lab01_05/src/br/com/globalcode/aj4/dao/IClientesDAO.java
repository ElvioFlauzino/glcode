package br.com.globalcode.aj4.dao;

import java.util.List;

import br.com.globalcode.aj4.util.GlobalcodeException;
import br.com.globalcode.model.Cliente;

public interface IClientesDAO {
	/**
	 * @param cliente
	 *            Cliente a ser inserido na fonte de dados em questao
	 * @throws GlobalcodeException
	 */
	public abstract void salvar(Cliente cliente) throws GlobalcodeException;

	/**
	 * @param CPF
	 *            do Cliente a ser excluido da fonte de dados em questao
	 * @throws GlobalcodeException
	 */
	public abstract void excluir(String cpf) throws GlobalcodeException;

	/**
	 * @return java.util.List contendo todos os clientes contidos na fonte da
	 *         dados em questao
	 * @throws GlobalcodeException
	 */
	public abstract List<Cliente> getAllClientes() throws GlobalcodeException;

	/**
	 * @param String
	 *            CPF do cliente a ser pesquisado no "banco de dados"
	 * @return Cliente
	 * @throws GlobalcodeException
	 */
	public abstract Cliente getClienteByCPF(String cpf)
			throws GlobalcodeException;
}

