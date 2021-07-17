package com.dio.controleponto.service;

import com.dio.controleponto.model.Empresa;
import com.dio.controleponto.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpresaService {

    @Autowired
    EmpresaRepository empresaRepository;

    public Empresa save(Empresa empresa){
        return empresaRepository.save(empresa);
    }

    public List<Empresa> findAll() {
        return empresaRepository.findAll();
    }

    public Optional<Empresa> getById(Long id) {

        return empresaRepository.findById(id);
    }

    public Empresa update(Empresa empresa){
        return empresaRepository.save(empresa);
    }

    public void delete(Long id) {
        empresaRepository.deleteById(id);
    }

}
