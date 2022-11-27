package com.componente.factinven.servicios.interfaz;

import org.springframework.data.domain.Page;

import com.componente.factinven.controller.AlmacenController.AlmacenRequest;
import com.componente.factinven.controller.AlmacenController.AlmacenResponse;

public interface IAlmacenServicio {

	public abstract  AlmacenResponse guardarAlmacen(AlmacenRequest  almacenRequest);
	
	public abstract  AlmacenResponse editarAlmacen(AlmacenRequest  almacenRequest);
	
	public abstract  AlmacenResponse buscarAlmacenNombre(String apellido);
	public abstract  AlmacenResponse findById(int id);
	
	public abstract  void eliminarAlmacen(AlmacenRequest  almacenRequest);
	
	public abstract  void borrarAlmacens();

	public abstract  Page<AlmacenResponse> listarAlmacens(int page, int size);
}
