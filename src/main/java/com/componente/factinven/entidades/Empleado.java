package com.componente.factinven.entidades;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

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
public class Empleado implements Serializable {


	private static final long serialVersionUID = 8542494766621710912L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@OneToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
	private Persona persona;
	@Column(columnDefinition = "TIMESTAMP")
	private LocalDateTime ingresoalaEmpresa;
	@OneToOne(cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
	private Almacen almacen;
	
	
}
