package com.componente.factinven.repositorios;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.componente.factinven.entidades.Almacen;

@Repository
public interface AlmacenRepositorio extends JpaRepository<Almacen, Integer> {

	public Almacen findByNombre(String apellidos);
	
	Page<Almacen> findAll(Pageable pageable);
	
}
