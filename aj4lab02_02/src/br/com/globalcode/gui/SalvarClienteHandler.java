package br.com.globalcode.gui;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import br.com.globalcode.beans.Cliente;
import br.com.globalcode.dao.ClientesDAO;
import br.com.globalcode.dao.ClientesDAOSerialization;
import br.com.globalcode.util.GlobalcodeException;

public class SalvarClienteHandler extends MouseAdapter {
	
	Cliente cliente;
	    final /* synthetic */ PanelCadastroClientes this$0;
	    
	    SalvarClienteHandler(final PanelCadastroClientes this$0) {
	        this.this$0 = this$0;
//	        super();
	        this.cliente = null;
	    }
	    
	    @Override
	    public void mouseClicked(final MouseEvent arg0) {
	        Cliente cliente = null;
	        try {
//	            cliente = PanelCadastroClientes.access$0(this.this$0);
	            final ClientesDAO dao = (ClientesDAO)new ClientesDAOSerialization();
	            dao.salvar(cliente);
	            this.this$0.cbClientes.reloadFromDatabase();
	        }
	        catch (GlobalcodeException e) {
	            e.printStackTrace();
	        }
	        System.out.println(cliente);
	    }
	
}
