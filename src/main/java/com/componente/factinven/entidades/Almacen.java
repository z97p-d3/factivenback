package com.componente.factinven.entidades;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.componente.factinven.controller.AlmacenController.AlmacenRequest;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Almacen implements Serializable {

	private static final long serialVersionUID = 4664298389131326855L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Size(max = 10)
	@NotBlank
	private String codigo;
	@Size(max = 45)
	private String nombre;
	@Size(max = 45)
	private String direccion;
	@Size(max = 10)
	private String telefono;
	//@NotNull
	@OneToOne(cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
	private Empleado empleadoaCargo;
	
	
	public Almacen(AlmacenRequest almacenRequest, Empleado empleadoaCargo) {
		this.codigo=almacenRequest.getCodigo();
		this.nombre=almacenRequest.getNombre();
		this.direccion=almacenRequest.getDireccion();
		this.telefono=almacenRequest.getTelefono();
		this.empleadoaCargo=empleadoaCargo;
	}
	
	
	

}
