package com.dio.controleponto.service;

import com.dio.controleponto.model.Usuario;
import com.dio.controleponto.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    public Usuario save(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    public Optional<Usuario> getById(Long id) {

        return usuarioRepository.findById(id);
    }

    public Usuario update(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    public void delete(Long id) {
        usuarioRepository.deleteById(id);
    }

}
