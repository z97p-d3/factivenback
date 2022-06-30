package com.componente.factinven.entidades;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
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
public class Articulo implements Serializable {

	private static final long serialVersionUID = 4817564908740006879L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@NotBlank
	private String codigo;
	@NotBlank
	private String nombre;
	@NotNull
	private BigDecimal precio;
	@NotBlank
	private String categoria;
	@NotBlank
	private int numeroExistencias;
	private int numeroExistenciasMinimo;
	@NotBlank
	private String unidaddeMedida;
	
}
