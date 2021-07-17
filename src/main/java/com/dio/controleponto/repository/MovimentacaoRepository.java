package com.dio.controleponto.repository;

import com.dio.controleponto.model.JornadaTrabalho;
import com.dio.controleponto.model.Movimentacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovimentacaoRepository extends JpaRepository<Movimentacao, Long> {

}
