package br.com.fiap.mymoney;


public class Usuario {
	
	private int idUsuario;
	private String cpf;
	private String nome;
	private String email;
	private int celular;
	private String login; 
	private String senha;
	
	public Usuario(int idUsuario, String cpf, String nome, String email, int celular, String login, String senha) {
		
		this.idUsuario = idUsuario;
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
		this.celular = celular;
		this.login = login;
		this.senha = senha;
	}
	

	public Usuario() {
		// TODO Auto-generated constructor stub
	}


	public int getIdUsuario() {
		return idUsuario;
	}


	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getCelular() {
		return celular;
	}


	public void setCelular(int celular) {
		this.celular = celular;
	}


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}


	
}

	