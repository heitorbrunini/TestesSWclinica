package entities;

import java.util.Date;

public abstract class User {
	
	protected Long id;
	protected Long cpf;
	protected Date nascimento;
	protected String nome;
	
	public User() {}
	
	
	public User(Long id, Long cpf, Date nascimento, String nome) {
		
		this.id = id;
		this.cpf = cpf;
		this.nascimento = nascimento;
		this.nome = nome;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Long getCpf() {
		return cpf;
	}


	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}


	public Date getNascimento() {
		return nascimento;
	}


	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	
}
