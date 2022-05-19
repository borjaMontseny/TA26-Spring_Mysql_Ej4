package dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "facultad")
public class Facultad {

	// Atributos de la entidad Facultad
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "nombre")
	private String nombre;

	@OneToMany
	@JoinColumn(name = "id")
	private List<Investigador> Investigador;

	@OneToMany
	@JoinColumn(name = "id")
	private List<Equipo> Equipo;

	public Facultad() {
		super();
	}

	public Facultad(int id, String nombre, List<Investigador> investigador, List<Equipo> equipo) {
		super();
		this.id = id;
		this.nombre = nombre;
		Investigador = investigador;
		Equipo = equipo;
	}

	public int getId() {
		return id;
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

	@JsonIgnore
	public List<Investigador> getInvestigador() {
		return Investigador;
	}

	public void setInvestigador(List<Investigador> investigador) {
		Investigador = investigador;
	}

	@JsonIgnore
	public List<Equipo> getEquipo() {
		return Equipo;
	}

	public void setEquipo(List<Equipo> equipo) {
		Equipo = equipo;
	}

	@Override
	public String toString() {
		return "Facultad [id=" + id + ", nombre=" + nombre + ", Investigador=" + Investigador + ", Equipo=" + Equipo
				+ "]";
	}

}