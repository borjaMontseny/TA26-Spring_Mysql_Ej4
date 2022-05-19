package dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "equipos")
public class Equipo {

	// Atributos de entidad Equipo
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // busca ultimo valor e incrementa desde id final de db
	private int id;

	@Column(name = "nombre")
	private String nombre;

	@ManyToOne
	@JoinColumn(name = "facultad_id")
	Facultad facultad;

	@OneToMany
	@JoinColumn(name = "id")
	private List<Reserva> reserva;

	// Constructores
	public Equipo() {

	}

	public Equipo(int id, String nombre, Facultad facultad, List<Reserva> reserva) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.facultad = facultad;
		this.reserva = reserva;
	}



	// Getters & Setters
	
	public int getId() {
		return id;
	}

	public Facultad getFacultad() {
		return facultad;
	}


	public void setFacultad(Facultad facultad) {
		this.facultad = facultad;
	}


	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/*Cuando hay un @JsonIgnore tenemos que poner:
	 * "@OneToMany(fetch = FetchType.LAZY, mappedBy = "Reserva")"
	 * mappedBy = "tablaAIgnorar"
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Reserva")
	public List<Reserva> getReserva() {
		return reserva;
	}

	public void setReserva(List<Reserva> reserva) {
		this.reserva = reserva;
	}

	//toString
	
	@Override
	public String toString() {
		return "Equipo [id=" + id + ", nombre=" + nombre + ", facultad=" + facultad + ", reserva=" + reserva + "]";
	}

}
