package com.escola.api.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.escola.api.model.Aluno;
import com.escola.api.service.AlunoService;

@RestController
@RequestMapping("/api/aluno")
public class AlunoController {
	
	@Autowired
	private AlunoService alunoService;

	@GetMapping
	public ResponseEntity<List<Aluno>> buscar(
			//@RequestParam(value = "id", required = false) Long id, 
			@RequestParam(value = "nome", required = false) String nomeAluno) {
		List<Aluno> alunos = new ArrayList<>();

		return ResponseEntity.ok(alunos);

	}

}
