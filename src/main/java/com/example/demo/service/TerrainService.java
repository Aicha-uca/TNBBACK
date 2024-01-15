package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Terrain;
import com.example.demo.repository.TerrainRepository;

@Service
public class TerrainService {

	@Autowired
	TerrainRepository terrainRepository;

	public Terrain save(Terrain entity) {

		return terrainRepository.save(entity);
	}

	public Terrain findById(Integer integer) {
		return terrainRepository.findById(integer).get();
	}

	public List<Terrain> findAll() {
		return terrainRepository.findAll();
	}

	public void deleteById(Integer id) {
		terrainRepository.deleteById(id);
	}

	public List<Terrain> findBySurface(double surface) {
		
		return terrainRepository.findBySurface(surface);
	}

	public List<Terrain> findByRedevableCin(String cin) {
		return terrainRepository.findByRedevableCin(cin);
	}

}
