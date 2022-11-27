package com.componente.factinven.entidades;

import java.time.LocalDateTime;

import javax.persistence.Column;

public class EntidadPadre {
	
	@Column(name="created_date")
	private LocalDateTime createdDate;
	
	@Column(name="created_by")
	private Persona createdBy;
	
	@Column(name="updated_date")
	private LocalDateTime updatedDate;
	
	@Column(name="updated_by")
	private Persona updatedBy;
	
}
