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

import com.ta26.ej4.dto.Reserva;
import com.ta26.ej4.service.ReservaServiceImpl;

@RestController
@RequestMapping("/api")
public class ReservaController {

	@Autowired
	ReservaServiceImpl reservaServiceImpl;

	@GetMapping("/reserva")
	public List<Reserva> listarReserva() {
		return reservaServiceImpl.listarReserva();
	}

	@PostMapping("/reserva")
	public Reserva salvarReserva(@RequestBody Reserva reserva) {

		return reservaServiceImpl.guardarReserva(reserva);
	}

	@GetMapping("/reserva/{id}")
	public Reserva ReservaXID(@PathVariable(name = "id") int id) {

		Reserva Reserva_xid = new Reserva();

		Reserva_xid = reservaServiceImpl.reservaXID(id);

		return Reserva_xid;
	}

	@PutMapping("/reserva/{id}")
	public Reserva actualizarReserva(@PathVariable(name = "id") int id, @RequestBody Reserva Reserva) {

		Reserva Reserva_seleccionado = new Reserva();
		Reserva Reserva_actualizado = new Reserva();

		Reserva_seleccionado = reservaServiceImpl.reservaXID(id);

		Reserva_seleccionado.setEquipo(Reserva.getEquipo());
		Reserva_seleccionado.setInvestigador(Reserva.getInvestigador());
		Reserva_seleccionado.setComienzo(Reserva.getComienzo());
		Reserva_seleccionado.setFin(Reserva.getFin());

		Reserva_actualizado = reservaServiceImpl.actualizarReserva(Reserva_seleccionado);

		return Reserva_actualizado;
	}

	@DeleteMapping("/reserva/{id}")
	public void eleiminarReserva(@PathVariable(name = "id") int id) {
		reservaServiceImpl.eliminarReserva(id);
	}

}
