package service;

import java.util.List;

import dto.Reserva;

public interface IReservaService {

	// Metodos del CRUD
	public List<Reserva> listarReserva(); // Listar All

	public Reserva guardarReserva(Reserva reserva); // Guarda una Reserva. CREATE

	public Reserva reservaXID(int id); // Leer datos de una Reserva. READ

	public Reserva actualizarReserva(Reserva reserva); // Actualiza datos de la Reserva. UPDATE

	public void eliminarReserva(int id);// Elimina la Reserva. DELETE

}
