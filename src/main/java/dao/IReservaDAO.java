package dao;

import org.springframework.data.jpa.repository.JpaRepository;

import dto.Reserva;

public interface IReservaDAO extends JpaRepository<Reserva, Integer> {

}
