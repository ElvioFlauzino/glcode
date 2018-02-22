package br.com.globalcode.aj4.gui;

import java.util.List;

import javax.swing.JComboBox;

import br.com.globalcode.aj4.dao.ClientesDAO;
import br.com.globalcode.aj4.dao.IClientesDAO;
import br.com.globalcode.aj4.util.GlobalcodeException;
import br.com.globalcode.model.Cliente;

public class ComboClientes extends JComboBox  {
	
	public ComboClientes() throws GlobalcodeException {
		this.reloadFromDatabase();
	}

	public void reloadFromDatabase() throws GlobalcodeException {
		IClientesDAO db = new ClientesDAO();
		List<Cliente> clientes = db.getAllClientes();
		this.removeAllItems();
		for (Cliente c : clientes) {
			this.addItem(c);
		}
	}

}
