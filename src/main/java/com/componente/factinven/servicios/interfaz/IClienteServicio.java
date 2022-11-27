package com.componente.factinven.servicios.interfaz;

import java.util.List;

import org.springframework.data.domain.Page;

import com.componente.factinven.dto.ClienteRequest;
import com.componente.factinven.dto.ClienteResponse;
import com.componente.factinven.entidades.Cliente;

public interface IClienteServicio {

	public abstract  ClienteResponse guardarCliente(ClienteRequest cliente);
	
	public abstract  ClienteResponse editarCliente(ClienteRequest cliente);
	
	public abstract  void buscarClienteApellido(String apellido);
	
	public abstract  void eliminarCliente(ClienteRequest cliente);
	
	public abstract  void borrarClientes();
	
	public List<ClienteResponse> findAll();
	
	public List<ClienteResponse> findAllPorApellidoContains(String apellidos);
	
	public ClienteResponse findById(Integer idCliente );

	public abstract  Page<Cliente> listarClientes(int page, int size);
}
