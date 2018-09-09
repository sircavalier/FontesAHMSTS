package account.legacy.data;

import java.util.*;

public class ContaLegado {
	private TotalControleLancamento totalControleLancamento;
	private List<ControleLancamento> listaControleLancamento;
	private int indice;
	private short tamanhoPagina;
	private short totalElements;
	
	public ContaLegado() {
		this.totalControleLancamento = new TotalControleLancamento();
		this.listaControleLancamento = new ArrayList<ControleLancamento>();
	}
	
	public void setTotalControlLancamento(TotalControleLancamento totalControleLancamento) {
		this.totalControleLancamento = totalControleLancamento;
	}
	
	public TotalControleLancamento getTotalControleLancamento() {
		return this.totalControleLancamento;
	}
	
	public void setListaControleLancamento(List<ControleLancamento> listaControleLancamento) {
		this.listaControleLancamento = listaControleLancamento;
	}
	
	public List<ControleLancamento> getListaControleLancamento() {
		return this.listaControleLancamento;
	}
	
	public void setIndice(int indice) {
		this.indice = indice;
	}
	
	public int getIndice() {
		return this.indice;
	}
	
	public void setTamanhoPagina(short tamanhoPagina) {
		this.tamanhoPagina = tamanhoPagina;
	}
	
	public short getTamanhoPagina() {
		return this.tamanhoPagina;
	}
	
	public void setTotalElements(short totalElements) {
		this.totalElements = totalElements;
	}
	
	public short getTotalElements() {
		return this.totalElements;
	}
}