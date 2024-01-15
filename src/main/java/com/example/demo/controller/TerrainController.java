package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Terrain;
import com.example.demo.service.TerrainService;
@CrossOrigin("*")
@RequestMapping("/api/terrain")
@RestController
public class TerrainController {
	
	@Autowired
	TerrainService terainService;

	@PostMapping("/save")
	public void save(@RequestBody Terrain entity) {
		terainService.save(entity);
	}

	@GetMapping("/all")
	public List<Terrain> findAll() {
		return terainService.findAll();
	}

	@DeleteMapping("/delete/{id}")
	public void deleteById(@PathVariable Integer id) {
		terainService.deleteById(id);
	}

	

	@GetMapping("/findbycin/{cin}")
	public List<Terrain> findByRedevableCin(@PathVariable String cin) {
		return terainService.findByRedevableCin(cin);
	}

	@PutMapping("/update/{id}")
	public Terrain save(@RequestBody Terrain p, @PathVariable int id) {
		Terrain terain = terainService.findById(id);
		if (terain != null) {
			if (p.getNom() != null) {
				terain.setNom(p.getNom());

			}
			if (p.getDescription() != null) {
				terain.setDescription(p.getDescription());
			}

				terain.setSurface(p.getSurface());

			if(p.getRedevable() != null) {
				terain.setRedevable(p.getRedevable());
			}
			return terainService.save(terain);
		}
		return null;	}
	
	

}
