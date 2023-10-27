package com.escola.api.dto;

import com.escola.api.model.Frequencia;

public class FrequenciaDTO {

	private String aula1;

	private String aula2;

	private String aula3;

	private String aula4;

	private String aula5;

	private String aula6;

	private String aula7;

	private String aula8;

	private String aula9;

	private String aula10;

	public FrequenciaDTO() {

	}

	public FrequenciaDTO(String aula1, String aula2, String aula3, String aula4, String aula5, String aula6,
			String aula7, String aula8, String aula9, String aula10) {
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

	public FrequenciaDTO(Frequencia frequencia) {
		aula1 = frequencia.getAula1();
		aula2 = frequencia.getAula2();
		aula3 = frequencia.getAula3();
		aula4 = frequencia.getAula4();
		aula5 = frequencia.getAula5();
		aula6 = frequencia.getAula6();
		aula7 = frequencia.getAula7();
		aula8 = frequencia.getAula8();
		aula9 = frequencia.getAula9();
		aula10 = frequencia.getAula10();
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
