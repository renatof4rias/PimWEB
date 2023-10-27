package com.escola.api.model;

import org.springframework.data.annotation.Id;

import com.escola.api.dto.NotasDTO;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;


public class Notas {
	@EmbeddedId
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "np1")
	private float np1;

	@Column(name = "np2")
	private float np2;

	@Column(name = "trabalho")
	private float trabalho;

	public Notas() {

	}

	public Notas(Long id, float np1, float np2, float trabalho) {
		super();
		this.id = id;
		this.np1 = np1;
		this.np2 = np2;
		this.trabalho = trabalho;
	}

	public Notas(NotasDTO notasDTO) {
		np1 = notasDTO.getNp1();
		np1 = notasDTO.getNp2();
		np1 = notasDTO.getTrabalho();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public float getNp1() {
		return np1;
	}

	public void setNp1(float np1) {
		this.np1 = np1;
	}

	public float getNp2() {
		return np2;
	}

	public void setNp2(float np2) {
		this.np2 = np2;
	}

	public float getTrabalho() {
		return trabalho;
	}

	public void setTrabalho(float trabalho) {
		this.trabalho = trabalho;
	}

}
