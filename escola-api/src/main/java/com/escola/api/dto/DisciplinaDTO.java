package com.escola.api.dto;

import com.escola.api.model.Disciplina;

public class DisciplinaDTO {

	private Long id;

	private String nomeDisciplina;

	public DisciplinaDTO() {

	}

	public DisciplinaDTO(Long id, String nomeDisciplina) {
		this.id = id;
		this.nomeDisciplina = nomeDisciplina;
	}

	public DisciplinaDTO(Disciplina disciplina) {
		nomeDisciplina = disciplina.getNomeDisciplina();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeDisciplina() {
		return nomeDisciplina;
	}

	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}

}
