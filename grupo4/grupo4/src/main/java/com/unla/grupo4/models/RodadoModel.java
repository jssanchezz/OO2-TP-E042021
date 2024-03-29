package com.unla.grupo4.models;

import javax.validation.constraints.NotBlank;

public class RodadoModel {
	
	private int id;
	@NotBlank(message = "el campo dominio no debe estar vacio")
	private String dominio;
	@NotBlank(message = "el campo vehiculo no debe estar vacio")
	private String vehiculo;
	
	public RodadoModel() {}

	public RodadoModel(int id, String dominio, String vehiculo) {
		super();
		this.id = id;
		this.dominio = dominio;
		this.vehiculo = vehiculo;
	}

	public int getId() {
		return id;
	}

	public void setIdRodado(int idRodado) {
		this.id = idRodado;
	}

	public String getDominio() {
		return dominio;
	}

	public void setDominio(String dominio) {
		this.dominio = dominio;
	}

	public String getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(String vehiculo) {
		this.vehiculo = vehiculo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		return this.id == ((RodadoModel)obj).getId();
	}	
}
