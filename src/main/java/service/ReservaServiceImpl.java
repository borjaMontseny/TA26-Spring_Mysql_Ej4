package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ta26.ej4.dao.IReservaDAO;

import dto.Reserva;

@Service
public class ReservaServiceImpl implements IReservaService {

	@Autowired
	IReservaDAO iReservaDAO;

	@Override
	public List<Reserva> listarReserva() {
		// TODO Auto-generated method stub
		return iReservaDAO.findAll();
	}

	@Override
	public Reserva guardarReserva(Reserva facultad) {
		// TODO Auto-generated method stub
		return iReservaDAO.save(facultad);
	}

	@Override
	public Reserva reservaXID(int id) {
		// TODO Auto-generated method stub
		return iReservaDAO.findById(id).get();
	}

	@Override
	public Reserva actualizarReserva(Reserva facultad) {
		// TODO Auto-generated method stub
		return iReservaDAO.save(facultad);
	}

	@Override
	public void eliminarReserva(int id) {
		// TODO Auto-generated method stub
		iReservaDAO.deleteById(id);
	}

}
