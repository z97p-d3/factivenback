package com.componente.factinven.servicios.interfaz;

import java.util.List;

import org.springframework.data.domain.Page;

import com.componente.factinven.dto.ComprobanteRequest;
import com.componente.factinven.dto.ComprobanteResponse;
import com.componente.factinven.dto.ComprobanteRequest.DetalleComprobanteRequest;

public interface IDetalleComprobanteServicio {

	public abstract  ComprobanteResponse guardarComprobante(DetalleComprobanteRequest detalleComprobante);
	
	public abstract  ComprobanteResponse editarComprobante(ComprobanteRequest comprobante);
	
	public abstract  ComprobanteResponse buscarComprobanteCodigo(String codigo);
	
	public abstract  void eliminarComprobante(ComprobanteRequest comprobante);
	
	public abstract  void borrarComprobantes();

	public abstract  Page<ComprobanteResponse> listarComprobantes(int page, int size);
	
	public List<ComprobanteResponse> findAll();
	
	public ComprobanteResponse findById(Integer id);
}
