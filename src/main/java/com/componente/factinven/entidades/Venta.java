package com.componente.factinven.entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
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
public class Venta implements Serializable {


	private static final long serialVersionUID = 5422395194141514163L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@NotNull
	@Column(columnDefinition = "TIMESTAMP")
	private LocalDateTime ventaFechayHora;
	@NotNull
	private Empleado empleado;	
	@NotNull
	private Cliente cliente;
	@NotBlank
	private String estado;  //Borrador, Cerrado
	@NotNull
	@OneToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
	private Almacen almacen;
	@NotEmpty
	private String formaPago;
	@NotEmpty
	@OneToMany(cascade = CascadeType.MERGE, fetch = FetchType.LAZY, mappedBy="venta", orphanRemoval = true)
	private List<DetalleVenta> detallesVenta;
	@Transient
	private BigDecimal totalFactura;
}
