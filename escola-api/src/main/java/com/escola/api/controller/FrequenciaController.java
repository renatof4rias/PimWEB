package com.escola.api.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.escola.api.model.Frequencia;

@RestController
@RequestMapping("/api/frequencia")
public class FrequenciaController {

	
	@GetMapping
	public ResponseEntity<List<Frequencia>> buscar(@RequestParam(value = "id", required = false) Long id){
		List<Frequencia> frequencias = new ArrayList<>();
		return ResponseEntity.ok(frequencias);
	}
	
}
