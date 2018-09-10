package com.account.legacy.api.documents;

import java.util.ArrayList;
import java.util.List;

public class LancamentoContaCorrenteCliente {
	private long numeroRemessaBanco;
    private String nomeTipoOperacao;
    private List<DadosAnaliticoLancamentoFinanceiroCliente> dadosAnaliticoLancamentoFinanceiroCliente;
    private DadosDomicilioBancario dadosDomicilioBancario;
    private String nomeSituacaoRemessa;
    
    public LancamentoContaCorrenteCliente() {
    	this.dadosAnaliticoLancamentoFinanceiroCliente = new ArrayList<DadosAnaliticoLancamentoFinanceiroCliente>();
    	this.dadosDomicilioBancario = new DadosDomicilioBancario();
    }
    
    public void setNumeroRemessaBanco(long numeroRemessaBanco) {
    	this.numeroRemessaBanco = numeroRemessaBanco;
    }
    
    public long getNumeroRemessaBanco() {
    	return this.numeroRemessaBanco;
    }
    
    public void setNomeTipoOperacao(String nomeTipoOperacao) {
    	this.nomeTipoOperacao = nomeTipoOperacao;
    }
    
    public String getNomeTipoOperacao() {
    	return this.nomeTipoOperacao;
    }
    
    public void setDadosAnaliticoLancamentoFinanceiroCliente(List<DadosAnaliticoLancamentoFinanceiroCliente> dadosAnaliticoLancamentoFinanceiroCliente) {
    	this.dadosAnaliticoLancamentoFinanceiroCliente = dadosAnaliticoLancamentoFinanceiroCliente;
    }
    
    public List<DadosAnaliticoLancamentoFinanceiroCliente> getDadosAnaliticoLancamentoFinanceiroCliente() {
    	return this.dadosAnaliticoLancamentoFinanceiroCliente;
    }
    
    public void setDadosDomicilioBancario(DadosDomicilioBancario dadosDomicilioBancario) {
    	this.dadosDomicilioBancario = dadosDomicilioBancario;
    }
    
    public DadosDomicilioBancario getDadosDomicilioBancario() {
    	return this.dadosDomicilioBancario;
    }
    
    public void setNomeSituacaoRemessa(String nomeSituacaoRemessa) {
    	this.nomeSituacaoRemessa = nomeSituacaoRemessa;
    }
    
    public String getNomeSituacaoRemessa() {
    	return this.nomeSituacaoRemessa;
    }
}
