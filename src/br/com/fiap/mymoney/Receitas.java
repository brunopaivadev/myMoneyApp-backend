package br.com.fiap.mymoney;

import java.util.Calendar;
import java.util.Date;

public class Receitas extends Transacoes {
	
	private int idReceitas;
	private Float valorReceita;
	private Date dataReceita = new Date(Calendar.getInstance().getTimeInMillis());
	private String tipoCategoria;
	private Boolean statusRecebimento;
	private String nomeReceita;
	private String descReceita;
	
	public Receitas(int idTransacao, Date dataTransacao, int idReceitas, Float valorReceita, Date dataReceita,
			String tipoCategoria, Boolean statusRecebimento, String nomeReceita, String descReceita) {
		// Construtor da superclasse Transacoes
		super(idTransacao, dataTransacao);
		this.idReceitas = idReceitas;
		this.valorReceita = valorReceita;
		this.dataReceita = dataReceita;
		this.tipoCategoria = tipoCategoria;
		this.statusRecebimento = statusRecebimento;
		this.nomeReceita = nomeReceita;
		this.descReceita = descReceita;
	}

	public int getIdReceitas() {
		return idReceitas;
	}

	public void setIdReceitas(int idReceitas) {
		this.idReceitas = idReceitas;
	}

	public Float getValorReceita() {
		return valorReceita;
	}

	public void setValorReceita(Float valorReceita) {
		this.valorReceita = valorReceita;
	}

	public Date getDataReceita() {
		return dataReceita;
	}

	public void setDataReceita(Date dataReceita) {
		this.dataReceita = dataReceita;
	}

	public String getTipoCategoria() {
		return tipoCategoria;
	}

	public void setTipoCategoria(String tipoCategoria) {
		this.tipoCategoria = tipoCategoria;
	}

	public Boolean getStatusRecebimento() {
		return statusRecebimento;
	}

	public void setStatusRecebimento(Boolean statusRecebimento) {
		this.statusRecebimento = statusRecebimento;
	}

	public String getNomeReceita() {
		return nomeReceita;
	}

	public void setNomeReceita(String nomeReceita) {
		this.nomeReceita = nomeReceita;
	}

	public String getDescReceita() {
		return descReceita;
	}

	public void setDescReceita(String descReceita) {
		this.descReceita = descReceita;
	}

	


}
