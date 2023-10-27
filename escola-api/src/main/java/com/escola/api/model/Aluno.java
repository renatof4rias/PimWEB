package com.escola.api.model;


import org.springframework.data.annotation.Id;

import com.escola.api.dto.AlunoDTO;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

public class Aluno {
	
	@EmbeddedId
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "nomeAluno")
	private String nomeAluno;
	
	@Column(name = "cpfAluno")
	private String cpfAluno;
	
	@Column(name = "rgAluno")
	private String rgAluno;
	
	@Column(name = "dataNascimentoAluno")
	private String dataNascimentoAluno;
	
	@Column(name = "foneAluno")
	private String foneAluno;
	
	@Column(name = "emailAluno")
	private String emailAluno;
	
	@Column(name = "cepAluno")
	private String cepAluno;
	
	@Column(name = "enderecoAluno")
	private String enderecoAluno;

	public Aluno() {
	}

	public Aluno(Long id,String nomeAluno, String cpfAluno, String rgAluno, String dataNascimentoAluno, String foneAluno,String emailAluno, String cepAluno, String enderecoAluno) {
		this.id = id;
		this.nomeAluno = nomeAluno;
		this.cpfAluno = cpfAluno;
		this.rgAluno = rgAluno;
		this.dataNascimentoAluno = dataNascimentoAluno;
		this.foneAluno = foneAluno;
		this.emailAluno = emailAluno;
		this.cepAluno = cepAluno;
		this.enderecoAluno = enderecoAluno;
	}
	
	public Aluno(AlunoDTO alunoDTO) {
		nomeAluno = alunoDTO.getNomeAluno();
		cpfAluno = alunoDTO.getCpfAluno();
		rgAluno = alunoDTO.getRgAluno();
		dataNascimentoAluno = alunoDTO.getDataNascimentoAluno();
		foneAluno = alunoDTO.getFoneAluno();
		emailAluno = alunoDTO.getEmailAluno();
		cepAluno = alunoDTO.getCepAluno();
		enderecoAluno = alunoDTO.getEnderecoAluno();	
	}

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public String getCpfAluno() {
		return cpfAluno;
	}

	public void setCpfAluno(String cpfAluno) {
		this.cpfAluno = cpfAluno;
	}

	public String getRgAluno() {
		return rgAluno;
	}

	public void setRgAluno(String rgAluno) {
		this.rgAluno = rgAluno;
	}

	public String getDataNascimentoAluno() {
		return dataNascimentoAluno;
	}

	public void setDataNascimentoAluno(String dataNascimentoAluno) {
		this.dataNascimentoAluno = dataNascimentoAluno;
	}

	public String getFoneAluno() {
		return foneAluno;
	}

	public void setFoneAluno(String foneAluno) {
		this.foneAluno = foneAluno;
	}

	public String getEmailAluno() {
		return emailAluno;
	}

	public void setEmailAluno(String emailAluno) {
		this.emailAluno = emailAluno;
	}

	public String getCepAluno() {
		return cepAluno;
	}

	public void setCepAluno(String cepAluno) {
		this.cepAluno = cepAluno;
	}

	public String getEnderecoAluno() {
		return enderecoAluno;
	}

	public void setEnderecoAluno(String enderecoAluno) {
		this.enderecoAluno = enderecoAluno;
	}

}
