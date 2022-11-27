package com.componente.factinven.servicios.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.componente.factinven.entidades.Empleado;
import com.componente.factinven.repositorios.EmpleadoRepositorio;
import com.componente.factinven.servicios.interfaz.IEmpleadoServicio;

@Service
public class EmpleadoServicioImpl implements IEmpleadoServicio {

	@Autowired
	
	private EmpleadoRepositorio empleadoRepositorio;
	@Override
	public void guardarEmpleado(Empleado Empleado) {
		// TODO Auto-generated method stub
		empleadoRepositorio.save(Empleado);
	}

	@Override
	public void editarEmpleado(Empleado Empleado) {
		// TODO Auto-generated method stub
		empleadoRepositorio.save(Empleado);
	}

	@Override
	public Empleado buscarEmpleadoApellido(String apellido) {
		// TODO Auto-generated method stub
       return empleadoRepositorio.findByPersonaApellidos(apellido);		
	}

	@Override
	public void eliminarEmpleado(Empleado Empleado) {
		// TODO Auto-generated method stub
		empleadoRepositorio.delete(Empleado);
	}

	@Override
	public void borrarEmpleados() {
		// TODO Auto-generated method stub
		empleadoRepositorio.deleteAll();
	}

	@Override
	public Page<Empleado> listarEmpleados(int page, int size) {
		Pageable pages = PageRequest.of(page, size);
		return this.empleadoRepositorio.findAll(pages);
	}
	
	




}
