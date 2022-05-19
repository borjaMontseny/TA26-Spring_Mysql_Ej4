package dao;

import org.springframework.data.jpa.repository.JpaRepository;

import dto.Equipo;

public interface IEquipoDAO extends JpaRepository<Equipo, Integer> {

}
