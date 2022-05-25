package com.ta26.ej4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dto.Equipo;
import service.EquipoServiceImpl;

@RestController
@RequestMapping("/api")
public class EquipoController {

	@Autowired
	EquipoServiceImpl equipoServiceImpl;
	
	@GetMapping("/equipo")
	public List<Equipo> listarEquipo() {
		return equipoServiceImpl.listarEquipo();
	}

	@PostMapping("/equipo")
	public Equipo salvarEquipo(@RequestBody Equipo equipo) {

		return equipoServiceImpl.guardarEquipo(equipo);
	}

	@GetMapping("/equipo/{id}")
	public Equipo equipoXID(@PathVariable(name = "id") int id) {

		Equipo Equipo_xid = new Equipo();

		Equipo_xid = equipoServiceImpl.equipoXID(id);

		System.out.println("Equipo XID: " + Equipo_xid);

		return Equipo_xid;
	}

	@PutMapping("/equipo/{id}")
	public Equipo actualizarEquipo(@PathVariable(name = "id") int id, @RequestBody Equipo equipo) {

		Equipo Equipo_seleccionado = new Equipo();
		Equipo Equipo_actualizado = new Equipo();

		Equipo_seleccionado = equipoServiceImpl.equipoXID(id);

		Equipo_seleccionado.setNombre(equipo.getNombre());

		Equipo_actualizado = equipoServiceImpl.actualizarEquipo(Equipo_seleccionado);

		System.out.println("La Equipo actualizada es: " + Equipo_actualizado);

		return Equipo_actualizado;
	}

	@DeleteMapping("/equipo/{id}")
	public void eliminarRegistroCurso(@PathVariable(name = "id") int id) {
		equipoServiceImpl.eliminarEquipo(id);
	}
	
}
