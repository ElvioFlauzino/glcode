package br.com.globalcode.util;

public class GlobalcodeException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public GlobalcodeException(String mensagem, Exception e) {
		super(mensagem, e);
	}

	public GlobalcodeException(String mensagem) {
		super(mensagem);
	}

}
