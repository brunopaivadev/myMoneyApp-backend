package br.com.fiap.mymoney;

import java.util.Calendar;
import java.util.Date;

public class Conta extends Usuario {
	
	private Date dataAtual = new Date(Calendar.getInstance().getTimeInMillis()); 
	private Float totalDespesas;
	private Float totalReceitas;
	private Float totalInvest;
	private Float totalSaldo; 

	public Conta(int idUsuario, String cpf, String nome, String email, int celular, String login, String senha, Date dataAtual,
			Float totalDespesas, Float totalReceitas, Float totalInvest, Float totalSaldo) {
		// Construtor da superclasse Usuario
		super(idUsuario, cpf, nome, email, celular, login, senha);
		this.dataAtual = dataAtual;
		this.totalDespesas = totalDespesas;
		this.totalReceitas = totalReceitas;
		this.totalSaldo = totalSaldo;
	}

	public Conta() {
		// TODO Auto-generated constructor stub
	}

	public Date getDataAtual() {
		return dataAtual;
	}

	public void setDataAtual(Date dataAtual) {
		this.dataAtual = dataAtual;
	}

	public Float getTotalDespesas() {
		return totalDespesas;
	}

	public void setTotalDespesas(Float totalDespesas) {
		this.totalDespesas = totalDespesas;
	}

	public Float getTotalReceitas() {
		return totalReceitas;
	}

	public void setTotalReceitas(Float totalReceitas) {
		this.totalReceitas = totalReceitas;
	}

	public Float getTotalInvest() {
		return totalInvest;
	}

	public void setTotalInvest(Float totalInvest) {
		this.totalInvest = totalInvest;
	}

	public Float getTotalSaldo() {
		return totalSaldo;
	}

	public void setTotalSaldo(Float totalSaldo) {
		this.totalSaldo = totalSaldo;
	}


}
