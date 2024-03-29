package com.unla.grupo4.entities;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "permiso_periodo")
public class PermisoPeriodo extends Permiso {
	@Column(name = "cantDias")
	private int cantDias;
	@Column(name = "vacaciones")
	private boolean vacaciones;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="rodado_id", nullable=false)
	private Rodado rodado;

	public PermisoPeriodo() {}

	public PermisoPeriodo(int id, LocalDate fecha, Person person, Set<Lugar> desdeHasta, int cantDias,
			boolean vacaciones, Rodado rodado) {
		super(id, fecha, person, desdeHasta);
		this.cantDias = cantDias;
		this.vacaciones = vacaciones;
		this.rodado = rodado;
	}

	public int getCantDias() {
		return cantDias;
	}

	public void setCantDias(int cantDias) {
		this.cantDias = cantDias;
	}

	public boolean isVacaciones() {
		return vacaciones;
	}

	public void setVacaciones(boolean vacaciones) {
		this.vacaciones = vacaciones;
	}

	public Rodado getRodado() {
		return rodado;
	}

	public void setRodado(Rodado rodado) {
		this.rodado = rodado;
	}
	
	
	
}
