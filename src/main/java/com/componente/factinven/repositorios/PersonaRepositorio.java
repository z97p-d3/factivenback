package com.componente.factinven.repositorios;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.componente.factinven.entidades.Persona;

@Repository
public interface PersonaRepositorio extends JpaRepository<Persona, Integer> {

	public Persona findByApellidos(String apellidos);
	
	Page<Persona> findAll(Pageable pageable);
	
}
