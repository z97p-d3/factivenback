package com.componente.factinven.servicios.interfaz;

import org.springframework.data.domain.Page;

import com.componente.factinven.entidades.Empleado;

public interface IEmpleadoServicio {

	public abstract  void guardarEmpleado(Empleado Empleado);
	
	public abstract  void editarEmpleado(Empleado Empleado);
	
	public abstract  Empleado buscarEmpleadoApellido(String apellido);
	
	public abstract  void eliminarEmpleado(Empleado Empleado);
	
	public abstract  void borrarEmpleados();

	public abstract  Page<Empleado> listarEmpleados(int page, int size);
}
