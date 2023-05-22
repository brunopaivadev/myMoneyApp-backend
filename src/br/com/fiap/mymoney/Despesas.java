package br.com.fiap.mymoney;

import java.util.Calendar;
import java.util.Date;

public class Despesas extends Transacoes {
	
	private int idDespesas;
	private Float valorDespesa;
	private Date dataDespesa = new Date(Calendar.getInstance().getTimeInMillis());
	private String tipoCategoria;
	private Boolean statusPag;
	private String nomeDespesa;
	private String descDespesa;

	public Despesas(int idTransacao, Date dataTransacao, int idDespesas, Float valorDespesa, Date dataDespesa,
			String tipoCategoria, Boolean statusPag, String nomeDespesa, String descDespesa) {
		// Construtor da superclasse Transacoes
		super(idTransacao, dataTransacao);
		this.idDespesas = idDespesas;
		this.valorDespesa = valorDespesa;
		this.dataDespesa = dataDespesa;
		this.tipoCategoria = tipoCategoria;
		this.statusPag = statusPag;
		this.nomeDespesa = nomeDespesa;
		this.descDespesa = descDespesa;
	}
	

	public int getIdDespesas() {
		return idDespesas;
	}

	public void setIdDespesas(int idDespesas) {
		this.idDespesas = idDespesas;
	}

	public Float getValorDespesa() {
		return valorDespesa;
	}

	public void setValorDespesa(Float valorDespesa) {
		this.valorDespesa = valorDespesa;
	}

	public Date getDataDespesa() {
		return dataDespesa;
	}

	public void setDataDespesa(Date dataDespesa) {
		this.dataDespesa = dataDespesa;
	}

	public String getTipoCategoria() {
		return tipoCategoria;
	}

	public void setTipoCategoria(String tipoCategoria) {
		this.tipoCategoria = tipoCategoria;
	}

	public Boolean getStatusPagamento() {
		return statusPag;
	}

	public void setStatusPagamento(Boolean statusPagamento) {
		this.statusPag = statusPagamento;
	}

	public String getNomeDespesa() {
		return nomeDespesa;
	}

	public void setNomeDespesa(String nomeDespesa) {
		this.nomeDespesa = nomeDespesa;
	}

	public String getDescDespesa() {
		return descDespesa;
	}

	public void setDescDespesa(String descDespesa) {
		this.descDespesa = descDespesa;
	}		
	
	

}
