package br.com.globalcode.io;

import java.io.File;
import java.io.FilenameFilter;

public class FiltroClientes implements FilenameFilter {
	
	public boolean accept(File dir, String nomeDoArquivo) {

		boolean inicioOk = nomeDoArquivo.startsWith("Cliente");
		boolean extensaoOk = nomeDoArquivo.endsWith(".ser");

		/*
		 * inserir c—digo a partir daqui
		 */
		
		return inicioOk && extensaoOk;
	}

}
