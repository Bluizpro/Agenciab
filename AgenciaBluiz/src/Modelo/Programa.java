package Modelo;

public class Programa {

	private Integer id;
	private String nome;
	private int senha;
	private String email;
	private String endereco;
	private String estado;
	private String cidade;
	private int telefone;
	



public Programa() {
	
}


public Programa(String nome, int senha, String email, String endereco, String estado, String cidade, int telefone) {
	super();
	this.nome = nome;
	this.senha = senha;
	this.email = email;
	this.endereco = endereco;
	this.estado = estado;
	this.cidade = cidade;
	this.telefone = telefone;
}


public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public int getSenha() {
	return senha;
}

public void setSenha(int senha) {
	this.senha = senha;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getEndereco() {
	return endereco;
}

public void setEndereco(String endereco) {
	this.endereco = endereco;
}

public String getEstado() {
	return estado;
}

public void setEstado(String estado) {
	this.estado = estado;
}

public String getCidade() {
	return cidade;
}

public void setCidade(String cidade) {
	this.cidade = cidade;
}

public int getTelefone() {
	return telefone;
}

public void setTelefone(int telefone) {
	this.telefone = telefone;
}
}



