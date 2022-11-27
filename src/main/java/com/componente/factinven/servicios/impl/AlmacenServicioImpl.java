package com.componente.factinven.servicios.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.componente.factinven.controller.AlmacenController.AlmacenRequest;
import com.componente.factinven.controller.AlmacenController.AlmacenResponse;
import com.componente.factinven.entidades.Almacen;
import com.componente.factinven.entidades.Empleado;
import com.componente.factinven.repositorios.AlmacenRepositorio;
import com.componente.factinven.repositorios.EmpleadoRepositorio;
import com.componente.factinven.servicios.interfaz.IAlmacenServicio;

@Service
public class AlmacenServicioImpl implements IAlmacenServicio {

	@Autowired
	private AlmacenRepositorio almacenRepositorio;
	
	@Autowired
	private EmpleadoRepositorio empleadoRepositorio;
	
	@Override
	public AlmacenResponse guardarAlmacen(AlmacenRequest almacenRequest) {
		Almacen almacen= new Almacen();
		almacen.setCodigo(almacenRequest.getCodigo());
		almacen.setDireccion(almacenRequest.getDireccion());
		almacen.setNombre(almacenRequest.getNombre());
		almacen.setTelefono(almacenRequest.getTelefono());
		Empleado empleado= empleadoRepositorio.findById(almacenRequest.getEmpleadoaCargoId()).get();
		almacen.setEmpleadoaCargo(empleado);
	  return new AlmacenResponse(almacenRepositorio.save(almacen));
	}

	@Override
	public AlmacenResponse editarAlmacen(AlmacenRequest almacenRequest) {
		Almacen almacen= new Almacen();
		almacen.setCodigo(almacenRequest.getCodigo());
		almacen.setDireccion(almacenRequest.getDireccion());
		almacen.setNombre(almacenRequest.getNombre());
		almacen.setTelefono(almacenRequest.getTelefono());
		Empleado empleado= empleadoRepositorio.findById(almacenRequest.getEmpleadoaCargoId()).get();
		almacen.setEmpleadoaCargo(empleado);
		return new AlmacenResponse(almacenRepositorio.save(almacen));
	}

	@Override
	public AlmacenResponse buscarAlmacenNombre(String nombre) {
		return new AlmacenResponse(almacenRepositorio.findByNombre(nombre));
		
	}

	@Override
	public void eliminarAlmacen(AlmacenRequest almacenRequest) {
		// TODO Auto-generated method stub
		Almacen almacen= new Almacen();
		almacen.setCodigo(almacenRequest.getCodigo());
		almacen.setDireccion(almacenRequest.getDireccion());
		almacen.setNombre(almacenRequest.getNombre());
		almacen.setTelefono(almacenRequest.getTelefono());
		Empleado empleado= empleadoRepositorio.findById(almacenRequest.getEmpleadoaCargoId()).get();
		almacen.setEmpleadoaCargo(empleado);
		
		almacenRepositorio.delete(almacen);
	}

	@Override
	public void borrarAlmacens() {
		// TODO Auto-generated method stub
		almacenRepositorio.deleteAll();
	}

	@Override
	public Page<AlmacenResponse> listarAlmacens(int page, int size) {
		Pageable pages = PageRequest.of(page, size);
		List<AlmacenResponse> listaRetorno = almacenRepositorio.findAll(pages).stream().map(x -> {
			return new AlmacenResponse(x);
		}).collect(Collectors.toList());
		return new PageImpl<AlmacenResponse>(listaRetorno);
	}

	@Override
	public AlmacenResponse findById(int id) {
		return new AlmacenResponse(almacenRepositorio.findById(id).get());
	}

}
