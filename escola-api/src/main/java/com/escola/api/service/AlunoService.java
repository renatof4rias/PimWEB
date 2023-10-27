package com.escola.api.service;

import org.springframework.stereotype.Service;

import com.escola.api.model.Aluno;

public interface AlunoService {
	Aluno buscar(Long id);	
}
