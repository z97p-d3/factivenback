package com.componente.factinven.repositorios;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.componente.factinven.entidades.Empleado;

@Repository
public interface EmpleadoRepositorio extends JpaRepository<Empleado, Integer> {

	public Empleado findByPersonaApellidos(String apellidos);
	
	Page<Empleado> findAll(Pageable pageable);
	
}
