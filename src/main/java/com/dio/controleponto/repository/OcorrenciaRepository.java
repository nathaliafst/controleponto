package com.dio.controleponto.repository;

import com.dio.controleponto.model.JornadaTrabalho;
import com.dio.controleponto.model.Ocorrencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OcorrenciaRepository extends JpaRepository<Ocorrencia, Long> {

}
