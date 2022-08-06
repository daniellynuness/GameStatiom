package com.generation.GameStation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.GameStation.model.Loja;



public interface LojaRepository extends JpaRepository<Loja,Long> {
	public List <Loja> findAllByCategoriaContainingIgnoreCase (String categoria);
}
