package br.com.fiap.mymoney;


public class Endereco extends Usuario {

	private int idEndereco;
	private String logradouro; 
	private Float cep;
	private String bairro;
	private String descComplemento; 
	
	public Endereco(int idUsuario, String cpf, String nome, String email, int celular, String login, String senha, int idEndereco,
			String logradouro, Float cep, String bairro, String descComplemento) {
		// Construtor da superclasse Usuario
		super(idUsuario, cpf, nome, email, celular, login, senha);
		this.idEndereco = idEndereco;
		this.logradouro = logradouro;
		this.cep = cep;
		this.bairro = bairro;
		this.descComplemento = descComplemento;
	}
	


	public int getIdEndereco() {
		return idEndereco;
	}

	public void setIdEndereco(int idEndereco) {
		this.idEndereco = idEndereco;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public Float getCep() {
		return cep;
	}

	public void setCep(Float cep) {
		this.cep = cep;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getDescComplemento() {
		return descComplemento;
	}

	public void setDescComplemento(String descComplemento) {
		this.descComplemento = descComplemento;
	}
	
	
}
