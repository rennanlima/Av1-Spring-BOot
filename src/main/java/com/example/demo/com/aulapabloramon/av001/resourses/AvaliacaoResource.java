package com.example.demo.com.aulapabloramon.av001.resourses;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


public class AvaliacaoResource {
	
	@RestController

	@RequestMapping(method=RequestMethod.GET)
	public String listar() {
	return "Avaliação terminada, professor Chimpa!";
	}

}
