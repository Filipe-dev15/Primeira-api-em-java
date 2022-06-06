package com.apiRecebe.first.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apiRecebe.first.model.Foto;
import com.apiRecebe.first.repository.FotoRepository;

@RestController
@RequestMapping("/foto")
public class fotoController {
	
	@Autowired
	private FotoRepository fotoRepository ;
	
	@GetMapping
	public List<Foto> listar(){
		return fotoRepository.findAll();
		
	}
	
	@PostMapping
	public Foto Adicionar(@RequestBody Foto foto) {
		return fotoRepository.save(foto);
	}

}
