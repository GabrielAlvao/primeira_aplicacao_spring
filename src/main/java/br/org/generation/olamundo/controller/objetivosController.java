package br.org.generation.olamundo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos")
public class objetivosController {

	@GetMapping
	public String objetivos() {
		return "Meus objetivos para esta semana são de aprender e me esforçar muito"
				+ " com Spring Boot por achar um dos conteudos mais dificeis"
				+ " e não desistir diante dificuldades persistindo e sempre atento aos"
				+ "detalhes";
	}
}
