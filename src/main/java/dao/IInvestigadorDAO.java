package dao;

import org.springframework.data.jpa.repository.JpaRepository;

import dto.Investigador;

public interface IInvestigadorDAO extends JpaRepository<Investigador, Integer>{

}
