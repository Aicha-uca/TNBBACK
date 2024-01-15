package com.example.demo.controller;

import java.util.List;

import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Taxe;
import com.example.demo.service.TauxService;
import com.example.demo.service.TaxeService;
@CrossOrigin("*")
@RestController
@RequestMapping("/api/taxe")
public class TaxeController {

	@Autowired
	TaxeService taxServier;

	@PostMapping("/save")
	public void save(@RequestBody Taxe entity) {
		taxServier.save(entity);
	}

	@GetMapping("/all")
	public List<Taxe> findAll() {
		return taxServier.findAll();
	}

	@DeleteMapping("/delete/{id}")
	public void deleteById(@PathVariable Integer id) {
		taxServier.deleteById(id);
	}
	
	
	
	
	
}
