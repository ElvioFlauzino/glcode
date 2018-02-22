package br.com.globalcode.gui;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TestePanelCadastroClientes extends JFrame {
	
	public TestePanelCadastroClientes(String titulo) {
		super(titulo);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		try {
			add(new PanelCadastroClientes());
			super.setSize(300, 200);
			//this.setVisible(true);
			this.pack();
			setLocationRelativeTo(null);
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, e.getMessage(),
					"Mensgem de Erro", JOptionPane.OK_OPTION);
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		TestePanelCadastroClientes gf = new TestePanelCadastroClientes(
				"Teste Cadastro Clientes");
		gf.setVisible(true);
	}

}
