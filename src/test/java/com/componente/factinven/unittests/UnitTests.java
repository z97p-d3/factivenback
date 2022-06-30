package com.componente.factinven.unittests;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

import com.componente.factinven.entidades.Persona;

public class UnitTests {

	//https://github.com/tiwasi/inventario/tree/master/AplicacionWebInventario/src/java/com/inventario/entidades
	//http://openaccess.uoc.edu/webapps/o2/bitstream/10609/65705/5/jgernunTFM0617memoria.pdf
	//https://www.incanatoit.com/2019/08/base-datos-compras-ventas-sql-server.html
	//http://opac.pucv.cl/pucv_txt/txt-3000/UCD3129_01.pdf
	//https://virtual.uptc.edu.co/ova/lenguaje-sql/modelo.pdf
	
	
	
	//1 Microincremenrto Repositories	
	
	//Crear Personas
	@Test
	public void crearPersona() {
	   Persona persona= Persona.builder().nombres("Andres").apellidos("Piedra").build();
		
       assertNotEquals(persona.getId(), 0); 		
	}
	
	//Editar Personas
	
	//Listar Personas con paginacion
	
	//Borrar Personas uno por uno
	

	//Crear Almacenes
	
	//Editar Almacenes
	
	//Listar Almacenes con paginacion
	
	//Borrar Almacenes uno por uno
	
	
	//Crear Producto
	
	//Editar Producto
	
	//Listar Productos con paginacion
	
	//Borrar Producto uno por uno
	
	
	
	//Crear Cliente
	
	//Editar Cliente
	
	//Listar Cliente con paginacion
	
	//Borrar Cliente uno por uno	
	
	
	//Crear Factura
	
	//Editar Factura
	
	//Listar Facturas con Paginacion
	
	//Borrar Factura uno por uno	
	
	
	//Crear Detalle Factura
	
    //Editar Detalle Factura
		
    //Listar Detalle Facturas con Paginacion
		
    //Borrar Detalle Factura uno por uno	
	
	
	
    //Crear Detalle Empleado
	
    //Editar Detalle Empleado
		
    //Listar Detalle Empleado con Paginacion
		
    //Borrar Detalle Empleado uno por uno
	
	
	
	
	
	
	
	
	//2 Microincremento 
	
	
	//Crear CategoriaProducto
	
	//Editar CategoriaProducto
	
	//Listar CategoriaProducto con paginacion
	
	//Borrar CategoriaProducto uno por uno

	
	//Crear FormaDePago
	
	//Editar FormaDePago
	
	//Listar FormaPago con paginacion
	
	//Borrar FormaPago uno por uno
	
	
	//Crear Proveedor
	
	//Editar Proveedor
	
	//Listar Proveedor con paginacion
	
	//Borrar Proveedor uno por uno
	
	
	//Crear Entradas
	
	//Editar Entradas
	
    //Listar Entradas con Paginacion
		
    //Borrar Entradas Factura uno por uno
	

	
	
	
	
	//4 Microincremento Microservicios de Catalogos
	
	
    //Crear Marca de Productos
	
    //Editar Marca de Producto
		
    //Listar Marca de Producto con Paginacion
		
    //Borrar Marca Productos uno por uno
	
	//Crear Categoria de Productos
	
    //Editar Categorias de Producto
		
    //Listar Categorias de Producto con Paginacion
		
    //Borrar Categorias Productos uno por uno
	


	
	
	
}
