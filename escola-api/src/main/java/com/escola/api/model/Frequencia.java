package com.escola.api.model;



import org.springframework.data.annotation.Id;

import com.escola.api.dto.FrequenciaDTO;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

public class Frequencia {

	@EmbeddedId
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "aula1")
	private String aula1;

	@Column(name = "aula2")
	private String aula2;

	@Column(name = "aula3")
	private String aula3;

	@Column(name = "aula4")
	private String aula4;

	@Column(name = "aula5")
	private String aula5;

	@Column(name = "aula6")
	private String aula6;

	@Column(name = "aula7")
	private String aula7;

	@Column(name = "aula8")
	private String aula8;

	@Column(name = "aula9")
	private String aula9;

	@Column(name = "aula10")
	private String aula10;

	public Frequencia() {

	}

	public Frequencia(Long id, String aula1, String aula2, String aula3, String aula4, String aula5, String aula6,
			String aula7, String aula8, String aula9, String aula10) {
		this.id = id;
		this.aula1 = aula1;
		this.aula2 = aula2;
		this.aula3 = aula3;
		this.aula4 = aula4;
		this.aula5 = aula5;
		this.aula6 = aula6;
		this.aula7 = aula7;
		this.aula8 = aula8;
		this.aula9 = aula9;
		this.aula10 = aula10;
	}

	public Frequencia(FrequenciaDTO frequenciaDTO) {
		aula1 = frequenciaDTO.getAula1();
		aula2 = frequenciaDTO.getAula2();
		aula3 = frequenciaDTO.getAula3();
		aula4 = frequenciaDTO.getAula4();
		aula5 = frequenciaDTO.getAula5();
		aula6 = frequenciaDTO.getAula6();
		aula7 = frequenciaDTO.getAula7();
		aula8 = frequenciaDTO.getAula8();
		aula9 = frequenciaDTO.getAula9();
		aula10 = frequenciaDTO.getAula10();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAula1() {
		return aula1;
	}

	public void setAula1(String aula1) {
		this.aula1 = aula1;
	}

	public String getAula2() {
		return aula2;
	}

	public void setAula2(String aula2) {
		this.aula2 = aula2;
	}

	public String getAula3() {
		return aula3;
	}

	public void setAula3(String aula3) {
		this.aula3 = aula3;
	}

	public String getAula4() {
		return aula4;
	}

	public void setAula4(String aula4) {
		this.aula4 = aula4;
	}

	public String getAula5() {
		return aula5;
	}

	public void setAula5(String aula5) {
		this.aula5 = aula5;
	}

	public String getAula6() {
		return aula6;
	}

	public void setAula6(String aula6) {
		this.aula6 = aula6;
	}

	public String getAula7() {
		return aula7;
	}

	public void setAula7(String aula7) {
		this.aula7 = aula7;
	}

	public String getAula8() {
		return aula8;
	}

	public void setAula8(String aula8) {
		this.aula8 = aula8;
	}

	public String getAula9() {
		return aula9;
	}

	public void setAula9(String aula9) {
		this.aula9 = aula9;
	}

	public String getAula10() {
		return aula10;
	}

	public void setAula10(String aula10) {
		this.aula10 = aula10;
	}

}
