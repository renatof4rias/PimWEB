package com.escola.api.dto;

import com.escola.api.model.Notas;

public class NotasDTO {

	private float np1;

	private float np2;

	private float trabalho;

	public NotasDTO() {

	}

	public NotasDTO(float np1, float np2, float trabalho) {
		this.np1 = np1;
		this.np2 = np2;
		this.trabalho = trabalho;
	}

	public NotasDTO(Notas notas) {
		np1 = notas.getNp1();
		np1 = notas.getNp2();
		np1 = notas.getTrabalho();
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
