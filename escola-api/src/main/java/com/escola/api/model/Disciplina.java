package com.escola.api.model;


import org.springframework.data.annotation.Id;

import com.escola.api.dto.DisciplinaDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

public class Disciplina {

	@EmbeddedId
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "nomeDisciplina")
	private String nomeDisciplina;

	public Disciplina() {
	}

	public Disciplina(Long id, String nomeDisciplina) {
		this.id = id;
		this.nomeDisciplina = nomeDisciplina;
	}

	public Disciplina(DisciplinaDTO disciplinaDTO) {
		nomeDisciplina = disciplinaDTO.getNomeDisciplina();
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
