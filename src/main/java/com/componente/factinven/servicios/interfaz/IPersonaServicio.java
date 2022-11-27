package com.componente.factinven.servicios.interfaz;

import org.springframework.data.domain.Page;

import com.componente.factinven.entidades.Persona;

public interface IPersonaServicio {

	public abstract  void guardarPersona(Persona persona);
	
	public abstract  void editarPersona(Persona persona);
	
	public abstract  void buscarPersonaApellido(String apellido);
	
	public abstract  void eliminarPersona(Persona persona);
	
	public abstract  void borrarPersonas();

	public abstract  Page<Persona> listarPersonas(int page, int size);
}
