package com.escola.api.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.escola.api.model.Disciplina;


@RestController
@RequestMapping("/api/disciplina")
public class DisciplinaController {

	
	@GetMapping
	public ResponseEntity<List<Disciplina>> buscar (@RequestParam(value = "id", required = false) Long id, @RequestParam(value = "nome", required = false)String nomeDisciplina){
		List<Disciplina> disciplinas = new ArrayList<>();
		return ResponseEntity.ok(disciplinas);
	}
}
