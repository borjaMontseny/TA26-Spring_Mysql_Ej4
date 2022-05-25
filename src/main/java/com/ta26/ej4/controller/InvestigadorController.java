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

import dto.Investigador;
import service.InvestigadorServiceImpl;

@RestController
@RequestMapping("/api")
public class InvestigadorController {

	@Autowired
	InvestigadorServiceImpl investigadorServiceImpl;

	@GetMapping("/investigador")
	public List<Investigador> listarInvestigador() {
		return investigadorServiceImpl.listarInvestigador();
	}

	@PostMapping("/investigador")
	public Investigador salvarInvestigador(@RequestBody Investigador investigador) {

		return investigadorServiceImpl.guardarInvestigador(investigador);
	}

	@GetMapping("/investigador/{id}")
	public Investigador investigadorXID(@PathVariable(name = "id") int id) {

		Investigador Investigador_xid = new Investigador();

		Investigador_xid = investigadorServiceImpl.investigadorXID(id);

		System.out.println("Investigador XID: " + Investigador_xid);

		return Investigador_xid;
	}

	@PutMapping("/investigador/{id}")
	public Investigador actualizarInvestigador(@PathVariable(name = "id") int id,
			@RequestBody Investigador investigador) {

		Investigador Investigador_seleccionado = new Investigador();
		Investigador Investigador_actualizado = new Investigador();

		Investigador_seleccionado = investigadorServiceImpl.investigadorXID(id);

		Investigador_seleccionado.setNomapels(investigador.getNomapels());

		Investigador_actualizado = investigadorServiceImpl.actualizarInvestigador(Investigador_seleccionado);

		System.out.println("La Investigador actualizada es: " + Investigador_actualizado);

		return Investigador_actualizado;
	}

	@DeleteMapping("/investigador/{id}")
	public void eliminarInvestigador(@PathVariable(name = "id") int id) {
		investigadorServiceImpl.eliminarInvestigador(id);
	}
}
