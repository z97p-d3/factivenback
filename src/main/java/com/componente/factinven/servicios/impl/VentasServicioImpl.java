package com.componente.factinven.servicios.impl;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.componente.factinven.dto.ComprobanteRequest;
import com.componente.factinven.dto.ComprobanteResponse;
import com.componente.factinven.dto.VentaResponse;
import com.componente.factinven.entidades.Venta;
import com.componente.factinven.repositorios.AlmacenRepositorio;
import com.componente.factinven.repositorios.ClienteRepositorio;
import com.componente.factinven.repositorios.ComprobanteRepositorio;
import com.componente.factinven.repositorios.EmpleadoRepositorio;
import com.componente.factinven.servicios.interfaz.IComprobanteServicio;

@Service
public class VentasServicioImpl implements IComprobanteServicio {
	
	@Autowired
	ComprobanteRepositorio comprobanteRespositorio;
	
	@Autowired
	AlmacenRepositorio almacenRespositorio;
	
	@Autowired
	ClienteRepositorio clienteRespositorio;
	
	@Autowired
	EmpleadoRepositorio empleadoRespositorio;

	@Override
	public ComprobanteResponse guardarComprobante(ComprobanteRequest comprobanteRequest) {
		comprobanteRequest.setFechaEmision(LocalDateTime.now());
		System.out.println(comprobanteRequest);
		Venta venta=  new Venta();
		venta.setCodigo(comprobanteRequest.getCodigo());
		venta.setEstado(comprobanteRequest.getEstado());
		//venta.setAlmacen(almacenRespositorio.findById(comprobanteRequest.getIdAlmacen()).orElse(null));
		System.out.println(clienteRespositorio.findById(comprobanteRequest.getIdCliente()).get());
		venta.setCliente(clienteRespositorio.findById(comprobanteRequest.getIdCliente()).orElse(null));
		//venta.setEmpleado(empleadoRespositorio.findById(comprobanteRequest.getIdEmpleado()).orElse(null));
		venta.setTotal(comprobanteRequest.getTotal());
		venta.setFormaPago(comprobanteRequest.getFormaPago());		
		venta.setFechayHora(comprobanteRequest.getFechaEmision());
	    return new VentaResponse(comprobanteRespositorio.save(venta));
	}

	@Override
	public ComprobanteResponse editarComprobante(ComprobanteRequest comprobante) {
		Venta venta=  new Venta();
		venta.setCodigo(comprobante.getCodigo());
	   return new VentaResponse(comprobanteRespositorio.save(venta));
		
	}

	@Override
	public ComprobanteResponse buscarComprobanteCodigo(String codigo) {
		return new ComprobanteResponse(comprobanteRespositorio.findByCodigo(codigo));
	}

	@Override
	public void eliminarComprobante(ComprobanteRequest comprobante) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borrarComprobantes() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Page<ComprobanteResponse> listarComprobantes(int page, int size) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ComprobanteResponse> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ComprobanteResponse findById(Integer id) {
		return  new ComprobanteResponse(comprobanteRespositorio.findById(id).get());
	}
	
	

}
