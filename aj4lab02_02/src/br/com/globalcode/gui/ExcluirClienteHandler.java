package br.com.globalcode.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import br.com.globalcode.beans.Cliente;
import br.com.globalcode.dao.ClientesDAO;
import br.com.globalcode.dao.ClientesDAOSerialization;
import br.com.globalcode.util.GlobalcodeException;

public class ExcluirClienteHandler implements ActionListener {
final /* synthetic */ PanelCadastroClientes this$0;
    
    ExcluirClienteHandler(final PanelCadastroClientes this$0) {
        this.this$0 = this$0;
     //   super();
    }
    
    @Override
    public void actionPerformed(final ActionEvent e) {
        final Cliente c = (Cliente)this.this$0.cbClientes.getSelectedItem();
        if (c != null) {
            final ClientesDAO dao = (ClientesDAO)new ClientesDAOSerialization();
            try {
                dao.excluir(c.getCpf());
      //          PanelCadastroClientes.access$1(this.this$0);
                this.this$0.cbClientes.reloadFromDatabase();
            }
            catch (GlobalcodeException ex) {
                ex.printStackTrace();
            }
        }
    }
}
