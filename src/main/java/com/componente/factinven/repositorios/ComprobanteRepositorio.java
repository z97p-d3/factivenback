package com.componente.factinven.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.componente.factinven.entidades.Comprobante;

@Repository
public interface ComprobanteRepositorio extends JpaRepository<Comprobante, Integer> {


	public Comprobante findByCodigo(String codigo);
}
