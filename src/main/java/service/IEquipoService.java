package service;

import java.util.List;

import dto.Equipo;

public interface IEquipoService {

	//Metodos del CRUD
	public List<Equipo> listarEquipo(); //Listar All 
	
	public Equipo guardarEquipo(Equipo equipo);	//Guarda un equipo. CREATE
	
	public Equipo equipoXID(int id); //Leer datos de un equipo. READ
	
	public Equipo actualizarEquipo(Equipo equipo); //Actualiza datos del equipo. UPDATE
	
	public void eliminarEquipo(int id);// Elimina el equipo. DELETE
	
}
