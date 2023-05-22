package br.com.fiap.mymoney;

import java.util.Calendar;
import java.util.Date;

public class Transacoes {
	
	public int idTransacao;
	public Date dataTransacao = new Date(Calendar.getInstance().getTimeInMillis());  
	
	public Transacoes(int idTransacao, Date dataTransacao) {
		this.idTransacao = idTransacao;
		this.dataTransacao = dataTransacao;
	}

	public int getIdTransacao() {
		return idTransacao;
	}

	public void setIdTransacao(int idTransacao) {
		this.idTransacao = idTransacao;
	}

	public Date getDataTransacao() {
		return dataTransacao;
	}

	public void setDataTransacao(Date dataTransacao) {
		this.dataTransacao = dataTransacao;
	}


}


