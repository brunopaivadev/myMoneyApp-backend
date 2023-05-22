package br.com.fiap.mymoney;

import java.util.Calendar;
import java.util.Date;

public class Invest extends Transacoes{

	private int idIvest;
	private Float valorInvest;
	private Date dataInvest = new Date(Calendar.getInstance().getTimeInMillis());
	private String tipoInvest;
	private String nomeInvest;
	private String descInvest;

	public Invest(int idTransacao, Date dataTransacao, int idIvest, Float valorInvest, Date dataInvest,
			String tipoInvest, String nomeInvest, String descInvest) {
		// Construtor da superclasse Transacoes
		super(idTransacao, dataTransacao);
		this.idIvest = idIvest;
		this.valorInvest = valorInvest;
		this.dataInvest = dataInvest;
		this.tipoInvest = tipoInvest;
		this.nomeInvest = nomeInvest;
		this.descInvest = descInvest;
	}

	

	public int getIdIvest() {
		return idIvest;
	}

	public void setIdIvest(int idIvest) {
		this.idIvest = idIvest;
	}

	public Float getValorInvest() {
		return valorInvest;
	}

	public void setValorInvest(Float valorInvest) {
		this.valorInvest = valorInvest;
	}

	public Date getDataInvest() {
		return dataInvest;
	}

	public void setDataInvest(Date dataInvest) {
		this.dataInvest = dataInvest;
	}

	public String getTipoInvest() {
		return tipoInvest;
	}

	public void setTipoInvest(String tipoInvest) {
		this.tipoInvest = tipoInvest;
	}

	public String getNomeInvest() {
		return nomeInvest;
	}

	public void setNomeInvest(String nomeInvest) {
		this.nomeInvest = nomeInvest;
	}

	public String getDescInvest() {
		return descInvest;
	}

	public void setDescInvest(String descInvest) {
		this.descInvest = descInvest;
	}
	
	
	
}

