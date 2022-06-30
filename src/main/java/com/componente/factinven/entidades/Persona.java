package com.componente.factinven.entidades;
import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
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
public class Persona implements Serializable {
	
	private static final long serialVersionUID = -346900551499497684L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
    @NotBlank
	private String nombres;
    @NotBlank
	private String apellidos;
    @NotBlank
	private String direccion;
    @NotBlank
    private String telefono;
    @Email
    private String email;
    @Column(columnDefinition = "TIME")
	public LocalDate fechaNacimiento;
    private String nombreUsuario;
    private String pin;
    private String identificacion;
}
