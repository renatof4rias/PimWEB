package com.escola.api.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.escola.api.model.Notas;

@RestController
@RequestMapping("/api/notas")
public class NotasController {

	@GetMapping
	public ResponseEntity<List<Notas>> buscar(@RequestParam(value = "id", required = false) Long id) {
		List<Notas> notas = new ArrayList<>();
		return ResponseEntity.ok(notas);
	}

}
