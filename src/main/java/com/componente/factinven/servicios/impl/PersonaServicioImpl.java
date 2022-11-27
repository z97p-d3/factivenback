package com.componente.factinven.servicios.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.componente.factinven.entidades.Persona;
import com.componente.factinven.repositorios.PersonaRepositorio;
import com.componente.factinven.servicios.interfaz.IPersonaServicio;

@Service
public class PersonaServicioImpl  implements IPersonaServicio {

	@Autowired
	private PersonaRepositorio personaRepositorio;
	
	
	@Override
	public void guardarPersona(Persona persona) {

		personaRepositorio.save(persona);
	}


	@Override
	public void buscarPersonaApellido(String apellido) {
		
		
	}


	@Override
	public void eliminarPersona(Persona persona) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Page<Persona> listarPersonas(int page, int size) {
		Pageable pages = PageRequest.of(page, size);
		return this.personaRepositorio.findAll(pages);
	}


	@Override
	public void editarPersona(Persona persona) {
		// TODO Auto-generated method stub
		this.personaRepositorio.save(persona);
	}


	@Override
	public void borrarPersonas() {
		// TODO Auto-generated method stub
         this.personaRepositorio.deleteAll();		
	}

}
