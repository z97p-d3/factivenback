package com.componente.factinven.entidades;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

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
public class DetalleVenta implements Serializable {


	private static final long serialVersionUID = -9023718735110319902L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@NotNull	
	@ManyToOne(fetch = FetchType.LAZY)
	private Venta venta;
	@NotNull
	private int unidad;
	@NotNull
	@ManyToOne(fetch = FetchType.LAZY)
	private Articulo articulo;
	@NotNull
	private BigDecimal precioUnitario;
	@NotNull
	private BigDecimal precioporDetalle;
	@NotNull
	private int numeroDetalle;
	
}
