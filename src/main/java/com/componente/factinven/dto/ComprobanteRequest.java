package com.componente.factinven.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Data;


@Data
public class ComprobanteRequest implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private LocalDateTime fechaEmision;
	private Integer idEmpleado;	
	private Integer idCliente;
	private String estado; 
	private String codigo;
	private Integer idAlmacen;
	private String formaPago;
	private BigDecimal total;
	
	@Data
	public class DetalleComprobanteRequest {
		
		private int productoId;
		private int cantidad;
		private int numeroDetalle;
		
	}
	
	

}
