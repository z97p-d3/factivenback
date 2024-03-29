package com.componente.factinven.servicios.impl;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.componente.factinven.dto.ComprobanteRequest;
import com.componente.factinven.dto.ComprobanteResponse;
import com.componente.factinven.dto.VentaRequest;
import com.componente.factinven.dto.VentaRequest.DetalleVentaRequest;
import com.componente.factinven.dto.VentaResponse;
import com.componente.factinven.entidades.DetalleComprobante;
import com.componente.factinven.entidades.DetalleVenta;
import com.componente.factinven.entidades.Venta;
import com.componente.factinven.repositorios.AlmacenRepositorio;
import com.componente.factinven.repositorios.ClienteRepositorio;
import com.componente.factinven.repositorios.ComprobanteRepositorio;
import com.componente.factinven.repositorios.DetalleComprobanteRepositorio;
import com.componente.factinven.repositorios.EmpleadoRepositorio;
import com.componente.factinven.repositorios.ProductoRepositorio;
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
	
	@Autowired
	DetalleComprobanteRepositorio detalleComprobanteRespositorio;
	
	
	@Autowired
	ProductoRepositorio productoRespositorio;

	@Override
	public ComprobanteResponse guardarComprobante(ComprobanteRequest comprobanteRequest) {
		VentaRequest ventaRequest= (VentaRequest) comprobanteRequest;
		comprobanteRequest.setFechaEmision(LocalDateTime.now());
		//System.out.println(ventaRequest);
		Venta venta=  new Venta();
		venta.setCodigo(ventaRequest.getCodigo());
		venta.setEstado(ventaRequest.getEstado());
		//venta.setAlmacen(almacenRespositorio.findById(comprobanteRequest.getIdAlmacen()).orElse(null));
		//System.out.println(clienteRespositorio.findById(ventaRequest.getIdCliente()).get());
		venta.setCliente(clienteRespositorio.findById(ventaRequest.getIdCliente()).orElse(null));
		//venta.setEmpleado(empleadoRespositorio.findById(comprobanteRequest.getIdEmpleado()).orElse(null));
		venta.setTotal(ventaRequest.getTotal());
		venta.setFormaPago(ventaRequest.getFormaPago());		
		venta.setFechayHora(ventaRequest.getFechaEmision());
		venta=comprobanteRespositorio.save(venta);
		System.out.println("DETALLE");
		for (DetalleVentaRequest det : ventaRequest.getItemsFactura()) {
			DetalleVenta deta= new DetalleVenta();
			deta.setProducto(productoRespositorio.findById(det.getProductoId()).orElse(null));
			deta.setPrecioUnitario(new BigDecimal(det.getPrecioUnitario()));
			deta.setUnidad(det.getNumeroItems());
			deta.setVenta(venta);
            detalleComprobanteRespositorio.save(deta);			
		}
		
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
	public List<VentaResponse> findAll() {
		List<VentaResponse> listaRetorna= new ArrayList<>();

		comprobanteRespositorio.findAll().forEach((n)->{
			VentaResponse venta= new VentaResponse();
			venta.setEstado(n.getEstado());
			venta.setFechayHora(n.getFechayHora());
			venta.setFormaPago(n.getFormaPago());
			venta.setNombreCliente(n.getCliente().getPersona().getNombres()+" "+n.getCliente().getPersona().getApellidos());
			venta.setId(n.getId());
			venta.setTotal(new BigDecimal(1000));
			//List<DetalleComprobante> lista= detalleComprobanteRespositorio.fin;
			listaRetorna.add(venta);
		});
		return listaRetorna;
	}

	@Override
	public ComprobanteResponse findById(Integer id) {
		return  new ComprobanteResponse(comprobanteRespositorio.findById(id).get());
	}
	
	

}
