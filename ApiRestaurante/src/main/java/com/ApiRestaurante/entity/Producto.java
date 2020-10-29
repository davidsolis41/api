package com.ApiRestaurante.entity;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "productos")
public class Producto implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7930232580494284507L;
	@Id
	private String id;
	private String foto;
	private String nombre;
	private String descripcion;
	private String ingredientes[];
	private int precio;
	private String categorias[];
	private int ventas;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public String[] getIngredientes() {
		return ingredientes;
	}
	public void setIngredientes(String[] ingredientes) {
		this.ingredientes = ingredientes;
	}
	
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public String[] getCategorias() {
		return categorias;
	}
	public void setCategorias(String[] categorias) {
		this.categorias = categorias;
	}
	
	public int getVentas() {
		return ventas;
	}
	public void Ventas(int ventas) {
		this.ventas = ventas;
	}	
}
