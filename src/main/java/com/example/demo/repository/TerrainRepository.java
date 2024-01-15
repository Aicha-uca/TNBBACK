package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Terrain;

public interface TerrainRepository extends JpaRepository<Terrain, Integer>{
	
	List<Terrain> findBySurface(double surface);
	
	
	List<Terrain> findByRedevableCin(String cin);

}
