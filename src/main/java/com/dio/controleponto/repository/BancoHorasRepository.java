package com.dio.controleponto.repository;

import com.dio.controleponto.model.BancoHoras;
import com.dio.controleponto.model.JornadaTrabalho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BancoHorasRepository extends JpaRepository<BancoHoras, Long> {

}
