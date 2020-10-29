package com.ApiRestaurante.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ventas")
public class Venta {
	

	/**
	 * 
	 */
	
	@Id
	private String id;
	private int productos_consumidos[];
	private float total_consumido;
	private int cliente;
	private int mesa;
	private int dia;
	private int mes;
	private int anio;
	private boolean entregado;
	private boolean pagado;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public int[] getProductos_consumidos() {
		return productos_consumidos;
	}
	public void setProductos_consumidos(int[] productos_consumidos) {
		this.productos_consumidos = productos_consumidos;
	}
	
	public float getTotal_consumido() {
		return total_consumido;
	}
	public void setTotal_consumido(float total_consumido) {
		this.total_consumido = total_consumido;
	}
	
	public int getCliente() {
		return cliente;
	}
	public void setCliente(int cliente) {
		this.cliente = cliente;
	}
	
	public int getMesa() {
		return mesa;
	}
	public void setMesa(int mesa) {
		this.mesa = mesa;
	}
	
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	
	public boolean getEntregado() {
		return entregado;
	}
	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}
	
	public boolean getPagado() {
		return pagado;
	}
	public void setPagado(boolean pagado) {
		this.pagado = pagado;
	}
}
