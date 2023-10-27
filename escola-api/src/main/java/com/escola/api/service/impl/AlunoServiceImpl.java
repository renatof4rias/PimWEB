package com.escola.api.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.escola.api.model.Aluno;
import com.escola.api.repository.AlunoRepository;
import com.escola.api.service.AlunoService;

@Service
public class AlunoServiceImpl implements AlunoService{
	
	@Autowired
	private AlunoRepository alunoRepository;
	
	@Override
	@Transactional(readOnly = true)
	public Aluno buscar(Long id) {
		Optional<Aluno> aluno = alunoRepository.findById(id);
		return aluno.get();
	}
}
