package com.escola.api.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.escola.api.model.Frequencia;
import com.escola.api.repository.FrequenciaRepository;
import com.escola.api.service.FrequenciaService;

public class FrequenciaServiceImpl implements FrequenciaService{

	@Autowired
	private FrequenciaRepository frequenciaRepository;
	
	@Override
	@Transactional(readOnly = true)
	public Frequencia buscar(Long id) {
		Optional<Frequencia> frequencia = frequenciaRepository.findById(id);
		return frequencia.get();
	}
	
}
