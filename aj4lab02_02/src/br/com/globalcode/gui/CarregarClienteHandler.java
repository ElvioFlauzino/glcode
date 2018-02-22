package br.com.globalcode.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import br.com.globalcode.beans.Cliente;

public class CarregarClienteHandler implements ActionListener {
	
final /* synthetic */ PanelCadastroClientes this$0;
    
    CarregarClienteHandler(final PanelCadastroClientes this$0) {
        this.this$0 = this$0;
     //   super();
    }
    
    @Override
    public void actionPerformed(final ActionEvent e) {
        final Cliente c = (Cliente)this.this$0.cbClientes.getSelectedItem();
        //PanelCadastroClientes.access$2(this.this$0, c);
    }

}
