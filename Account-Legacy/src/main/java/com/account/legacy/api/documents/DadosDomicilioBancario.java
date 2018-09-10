package com.account.legacy.api.documents;

public class DadosDomicilioBancario {
	private int codigoBanco;
	private int numeroAgencia;
	private String numeroContaCorrente;

	public void setCodigoBanco(int codigoBanco) {
		this.codigoBanco = codigoBanco;
	}
	
	public int getCodigoBanco() {
		return this.codigoBanco;
	}
	
	public void setNumeroAgencia(int numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}
	
	public int getNumeroAgencia() {
		return this.numeroAgencia;
	}
	
	public void setNumeroContaCorrente(String numeroContaCorrente) {
		this.numeroContaCorrente = numeroContaCorrente;
	}
	
	public String getNumeroContaCorrente( ) {
		return this.numeroContaCorrente;
	}
}