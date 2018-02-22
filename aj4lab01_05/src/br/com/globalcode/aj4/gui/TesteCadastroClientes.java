package br.com.globalcode.aj4.gui;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TesteCadastroClientes extends JFrame {
	
	public TesteCadastroClientes(String titulo) {
		super(titulo);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		try {
			add(new PainelCadastroClientes());
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
		TesteCadastroClientes gf = new TesteCadastroClientes(
				"Teste Cadastro Clientes");
		gf.setVisible(true);
	}

}
