package com.ApiRestaurante.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "clietes")
public class Cliente {
		/**
		 * 
		 */
	
		@Id
		private String id;
		private String nombre;
		private int nit;
		private String direccion;
		private String correo;
		private int total_compras;

		
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		
		public int getNit() {
			return nit;
		}
		public void setNit(int nit) {
			this.nit = nit;
		}
		
		public String getDireccion() {
			return direccion;
		}
		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}
		
		public String getCorreo() {
			return correo;
		}
		public void setCorreo(String correo) {
			this.correo = correo;
		}
		
		public int getTotal_compras() {
			return total_compras;
		}
		public void setTotal_compras(int total_compras) {
			this.total_compras = total_compras;
		}	

	}

