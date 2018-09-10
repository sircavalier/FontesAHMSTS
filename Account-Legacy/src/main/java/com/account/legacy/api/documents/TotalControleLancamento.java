package com.account.legacy.api.documents;

public class TotalControleLancamento {
	private int quantidadeLancamentos;
	private int quantidadeRemessas;
	private float valorLancamentos;
	
	public void setQuantidadeLancamentos(int quantidadeLancamentos) {
		this.quantidadeLancamentos = quantidadeLancamentos;
	}
	
	public int getQuantidadeLancamentos() {
		return this.quantidadeLancamentos;
	}
	
	public void setQuantidadeRemessa(int quantidadeRemessas) {
		this.quantidadeRemessas = quantidadeRemessas;
	}
	
	public int getQuantidadeRemessas() {
		return this.quantidadeRemessas;
	}
	
	public void setValorLancamentos(float valorLancamentos) {
		this.valorLancamentos = valorLancamentos;
	}
	
	public float getValorLancamentos() {
		return this.valorLancamentos;
	}
}
