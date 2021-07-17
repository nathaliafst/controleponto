package com.dio.controleponto.repository;

import com.dio.controleponto.model.Calendario;
import com.dio.controleponto.model.JornadaTrabalho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CalendarioRepository extends JpaRepository<Calendario, Long> {

}
