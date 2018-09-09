package account.legacy.data;

import java.util.Date;

public class Summary {
	//- Considerar a seguinte forma de apresentação:
	//	Data do lançamento | Descrição | Número | Situação | Data de confirmação | Dados bancários | Valor final
	//	18/11/2016 | Regular | 67210807400 | Pago | 18/11/2016 | BANCO ABCD S.A Ag 12 CC 0001231234 | R$ 28.714,00

	private Date dataLancamento;
	private String descricaoLancamento;
	private long numeroLancamento;
	private String descricaoSituacao;
	private Date dataConfirmacao;
	private String nomeBanco;
	private String numeroAgencia;
	private String numeroConta;
	private float valorFinal;
	
	public Summary() {
		
	}
	
	/***************************************************
	 * Método construtor da classe Summary
	 * @param dataLancamento Data do lançamento
	 * @param descricaoLancamento
	 * @param numeroLancamento
	 * @param descricaoSituacao
	 * @param dataConfirmacao
	 * @param nomeBanco
	 * @param numeroAgencia
	 * @param numeroConta
	 * @param valorFinal
	 */
	public Summary(Date dataLancamento,
				   String descricaoLancamento,
				   long numeroLancamento,
				   String descricaoSituacao,
				   Date dataConfirmacao,
				   String nomeBanco,
				   String numeroAgencia,
				   String numeroConta,
				   float valorFinal) {
		this.dataLancamento = dataLancamento;
		this.descricaoLancamento = descricaoLancamento;
		this.numeroLancamento = numeroLancamento;
		this.descricaoSituacao = descricaoSituacao;
		this.dataConfirmacao = dataConfirmacao;
		this.nomeBanco = nomeBanco;
		this.numeroAgencia = numeroAgencia;
		this.numeroConta = numeroConta;
		this.valorFinal = valorFinal;
	}
	
	public void setDataLancamento(Date dataLancamento) {
		this.dataLancamento = dataLancamento;
	}
	
	public Date getDataLancamento() {
		return this.dataLancamento;
	}
	
	public void setDescricaoLancamento(String descricaoLancamento) {
		this.descricaoLancamento = descricaoLancamento;
	}
	
	public String getDescricaoLancamento() {
		return this.descricaoLancamento;
	}
	
	public void setNumeroLancamento(long numeroLancamento) {
		this.numeroLancamento = numeroLancamento;
	}
	
	public long getNumeroLancamento() {
		return this.numeroLancamento;
	}
	
	public void setDescricaoSituacao(String descricaoSituacao) {
		this.descricaoSituacao = descricaoSituacao;
	}
	
	public String getDescricaoSituacao() {
		return this.descricaoSituacao;
	}
	
	public void setDataConfirmacao(Date dataConfirmacao) {
		this.dataConfirmacao = dataConfirmacao;
	}
	
	public Date getDataConfirmacao() {
		return this.dataConfirmacao;
	}
	
	public void setNomeBanco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}
	
	public String getNomeBanco() {
		return this.nomeBanco;
	}
	
	public void setNumeroAgencia(String numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}
	
	public String getNumeroAgencia() {
		return this.numeroAgencia;
	}
	
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	
	public String getNumeroConta() {
		return this.numeroConta;
	}
	
	public void setValorFinal(float valorFinal) {
		this.valorFinal = valorFinal;
	}
	
	public float getValorFinal() {
		return this.valorFinal;
	}
}
