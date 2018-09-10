package com.account.legacy.api.documents;

public class ControleLancamento {
	private String dataEfetivaLancamento; 
	private String dataLancamentoContaCorrenteCliente;
	private long numeroEvento;
	private String descricaoGrupoPagamento;
	private String codigoIdentificadorUnico;
	private String nomeBanco;
	private int quantidadeLancamentoRemessa;
	private String numeroRaizCNPJ;
	private String numeroSufixoCNPJ;
	private float valorLancamentoRemessa;
	private long dateLancamentoContaCorrenteCliente;
	private long dateEfetivaLancamento;
	private LancamentoContaCorrenteCliente lancamentoContaCorrenteCliente;
		
	public ControleLancamento() {
		this.lancamentoContaCorrenteCliente = new LancamentoContaCorrenteCliente();
	}
	
	public void setDataEfetivaLancamento(String dataEfetivaLancamento) {
		this.dataEfetivaLancamento = dataEfetivaLancamento;
	}
	
	public String getDataEfetivaLancamento() {
		return this.dataEfetivaLancamento;
	}
	
	public void setDataLancamentoContaCorrenteCliente (String dataLancamentoContaCorrenteCliente) {
		this.dataLancamentoContaCorrenteCliente = dataLancamentoContaCorrenteCliente;
	}
	
	public String getDataLancamentoContaCorrenteCliente() {
		return this.dataLancamentoContaCorrenteCliente;
	}
	
	public void setNumeroEvento (long numeroEvento) {
		this.numeroEvento = numeroEvento;
	}
	
	public long getNumeroEvento() {
		return this.numeroEvento;
	}
	
	public void setDescricaoGrupoPagamento (String descricaoGrupoPagamento) {
		this.descricaoGrupoPagamento = descricaoGrupoPagamento;
	}
	
	public String getDescricaoGrupoPagamento() {
		return this.descricaoGrupoPagamento;
	}
	
	public void setcodigoIdentificadorUnico (String codigoIdentificadorUnico) {
		this.codigoIdentificadorUnico = codigoIdentificadorUnico;
	}
	
	public String getCodigoIdentificadorUnico() {
		return this.codigoIdentificadorUnico;
	}
	
	public void setNomeBanco (String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}
	
	public String getNomeBanco() {
		return this.nomeBanco;
	}
	
	public void setQuantidadeLancamentoRemessa (int quantidadeLancamentoRemessa) {
		this.quantidadeLancamentoRemessa = quantidadeLancamentoRemessa;
	}
	
	public int getQuantidadeLancamentoRemessa() {
		return this.quantidadeLancamentoRemessa;
	}
	public void setNumeroRaizCNPJ (String numeroRaizCNPJ) {
		this.numeroRaizCNPJ = numeroRaizCNPJ;
	}
	
	public String getNumeroRaizCNPJ () {
		return this.numeroRaizCNPJ;
	}
	public void setNumeroSufixoCNPJ (String numeroSufixoCNPJ) {
		this.numeroSufixoCNPJ = numeroSufixoCNPJ;
	}
	
	public String getNumeroSufixoCNPJ() {
		return this.numeroSufixoCNPJ;
	}
	
	public void setValorLancamentoRemessa (float valorLancamentoRemessa) {
		this.valorLancamentoRemessa = valorLancamentoRemessa;
	}
	
	public float getValorLancamentoRemessa() {
		return this.valorLancamentoRemessa;
	}
	
	public void setDateLancamentoContaCorrenteCliente (long dateLancamentoContaCorrenteCliente) {
		this.dateLancamentoContaCorrenteCliente = dateLancamentoContaCorrenteCliente;
	}
	
	public long getDateLancamentoContaCorrenteCliente() {
		return this.dateLancamentoContaCorrenteCliente;
	}
	
	public void setDateEfetivaLancamento (long dateEfetivaLancamento) {
		this.dateEfetivaLancamento = dateEfetivaLancamento;
	}
	
	public long getDateEfetivaLancamento() {
		return this.dateEfetivaLancamento;
	}
	
	public void setLancamentoContaCorrenteCliente (LancamentoContaCorrenteCliente lancamentoContaCorrenteCliente) {
		this.lancamentoContaCorrenteCliente = lancamentoContaCorrenteCliente;
	}
	
	public LancamentoContaCorrenteCliente getLancamentoContaCorrenteCliente() {
		return this.lancamentoContaCorrenteCliente;
	};
}