package com.ta26.ej4.service;

import java.util.List;

import com.ta26.ej4.dto.Investigador;


public interface IInvestigadorService {
	
	//Metodos del CRUD
	public List<Investigador> listarInvestigador(); //Listar All 
	
	public Investigador guardarInvestigador(Investigador investigador);	//Guarda una Investigador. CREATE
	
	public Investigador investigadorXID(int id); //Leer datos de una Investigador. READ
	
	public Investigador actualizarInvestigador(Investigador investigador); //Actualiza datos de la Investigador. UPDATE
	
	public void eliminarInvestigador(int id);// Elimina la Investigador. DELETE
}
