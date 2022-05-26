package com.ta26.ej4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ta26.ej4.dao.IInvestigadorDAO;
import com.ta26.ej4.dto.Investigador;

@Service
public class InvestigadorServiceImpl implements IInvestigadorService {

	@Autowired
	IInvestigadorDAO iInvestigadorDAO;

	@Override
	public List<Investigador> listarInvestigador() {
		// TODO Auto-generated method stub
		return iInvestigadorDAO.findAll();
	}

	@Override
	public Investigador guardarInvestigador(Investigador investigador) {
		// TODO Auto-generated method stub
		return iInvestigadorDAO.save(investigador);
	}

	@Override
	public Investigador investigadorXID(int id) {
		// TODO Auto-generated method stub
		return iInvestigadorDAO.findById(id).get();
	}

	@Override
	public Investigador actualizarInvestigador(Investigador investigador) {
		// TODO Auto-generated method stub
		return iInvestigadorDAO.save(investigador);
	}

	@Override
	public void eliminarInvestigador(int id) {
		// TODO Auto-generated method stub
		iInvestigadorDAO.deleteById(id);
	}

}
