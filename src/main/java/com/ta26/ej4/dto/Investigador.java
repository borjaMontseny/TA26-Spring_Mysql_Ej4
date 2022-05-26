package com.ta26.ej4.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "investigadores")
public class Investigador {

	//Atributos de la entidad Investigador
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "nomapels")
	private String nomapels;
	
	// Asi se representa una FK
	@ManyToOne
    @JoinColumn(name="facultad_id")
    Facultad facultad;
	
	/* One to Many porque investigadores no tiene un atributo
	 * que haga referencia a reserva*/
	@OneToMany
    @JoinColumn(name="id")
    private List<Reserva> reserva;
    
	
	// Constructores
	
	public Investigador() {
		
	}

	public Investigador(int id, String nomapels, Facultad facultad, List<Reserva> reserva) {
		super();
		this.id = id;
		this.nomapels = nomapels;
		this.facultad = facultad;
		this.reserva = reserva;
	}

	
	// Getters & Setters
	
	
	public Facultad getFacultad() {
		return facultad;
	}

	public void setFacultad(Facultad facultad) {
		this.facultad = facultad;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Reserva")
	public List<Reserva> getReserva() {
		return reserva;
	}

	public void setReserva(List<Reserva> reserva) {
		this.reserva = reserva;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomapels() {
		return nomapels;
	}

	public void setNomapels(String nomapels) {
		this.nomapels = nomapels;
	}

	@Override
	public String toString() {
		return "Investigador [id=" + id + ", nomapels=" + nomapels + ", facultad=" + facultad + ", reserva=" + reserva
				+ "]";
	}
	
	
}
