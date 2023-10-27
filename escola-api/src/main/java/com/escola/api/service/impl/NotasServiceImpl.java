package com.escola.api.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.escola.api.model.Notas;
import com.escola.api.repository.NotasRepository;
import com.escola.api.service.NotasService;

@Service
public class NotasServiceImpl implements NotasService {

	@Autowired
	private NotasRepository notasRepository;

	@Override
	@Transactional(readOnly = true)
	public Notas buscar(long id) {
		Optional<Notas> notas = notasRepository.findById(id);
		return notas.get();
	}

}
