package com.dio.controleponto.repository;

import com.dio.controleponto.model.CategoriaUsuario;
import com.dio.controleponto.model.JornadaTrabalho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaUsuarioRepository extends JpaRepository<CategoriaUsuario, Long> {

}
