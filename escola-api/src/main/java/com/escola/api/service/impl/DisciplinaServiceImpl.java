package com.escola.api.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.escola.api.model.Disciplina;
import com.escola.api.repository.DisciplinaRepository;
import com.escola.api.service.DisciplinaService;

@Service
public class DisciplinaServiceImpl implements DisciplinaService {

	@Autowired
	private DisciplinaRepository disciplinaRepository;

	@Override
	@Transactional(readOnly = true)
	public Disciplina buscar(Long id) {
		Optional<Disciplina> disciplina = disciplinaRepository.findById(id);
		return disciplina.get();
	}

}
