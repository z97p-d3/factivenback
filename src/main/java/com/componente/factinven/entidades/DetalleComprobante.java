package com.componente.factinven.entidades;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

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
@Inheritance(strategy= InheritanceType.JOINED)
public class DetalleComprobante implements Serializable {

	private static final long serialVersionUID = -9023718735110319902L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
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
	@OneToOne(cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
	private Producto producto;
	
}
