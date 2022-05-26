package com.ta26.ej4.service;

import java.util.List;

import com.ta26.ej4.dto.Facultad;

public interface IFacultadService {
	
	//Metodos del CRUD
	public List<Facultad> listarFacultad(); //Listar All 
	
	public Facultad guardarFacultad(Facultad facultad);	//Guarda una Facultad. CREATE
	
	public Facultad facultadXID(int id); //Leer datos de una Facultad. READ
	
	public Facultad actualizarFacultad(Facultad facultad); //Actualiza datos de la Facultad. UPDATE
	
	public void eliminarFacultad(int id);// Elimina la Facultad. DELETE
}
