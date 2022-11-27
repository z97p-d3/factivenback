package com.componente.factinven.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.componente.factinven.entidades.Proveedor;

@Repository
public interface ProveedorRepositorio extends JpaRepository<Proveedor, Integer> {

	public List<Proveedor> findByNombreContainingIgnoreCase(String nombre);
}
