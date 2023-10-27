package com.escola.api.dto;

import com.escola.api.model.Aluno;

public class AlunoDTO {

	private String nomeAluno;
	
	private String cpfAluno;
	
	private String rgAluno;
	
	private String dataNascimentoAluno;
	
	private String foneAluno;
	
	private String emailAluno;
	
	private String cepAluno;
	
	private String enderecoAluno;
	
	public AlunoDTO() {
			
	}
	
	public AlunoDTO(String nomeAluno, String cpfAluno, String rgAluno, String dataNascimentoAluno,String foneAluno, String emailAluno, String cepAluno, String enderecoAluno) {
		this.nomeAluno = nomeAluno;
		this.cpfAluno = cpfAluno;
		this.rgAluno = rgAluno;
		this.dataNascimentoAluno = dataNascimentoAluno;
		this.foneAluno = foneAluno;
		this.emailAluno = emailAluno;
		this.cepAluno = cepAluno;
		this.enderecoAluno = enderecoAluno;
	}

	public AlunoDTO(Aluno aluno) {
		nomeAluno = aluno.getNomeAluno();
		cpfAluno = aluno.getCpfAluno();
		rgAluno = aluno.getRgAluno();
		dataNascimentoAluno = aluno.getDataNascimentoAluno();
		foneAluno = aluno.getFoneAluno();
		emailAluno = aluno.getEmailAluno();
		cepAluno = aluno.getCepAluno();
		enderecoAluno = aluno.getEnderecoAluno();			
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
