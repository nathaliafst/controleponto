package com.dio.controleponto.controller;

import com.dio.controleponto.model.JornadaTrabalho;
import com.dio.controleponto.model.Usuario;
import com.dio.controleponto.service.JornadaTrabalhoService;
import com.dio.controleponto.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jornada")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

        @PostMapping
        public Usuario save(@RequestBody Usuario usuario){
            return usuarioService.save(usuario);
        }

        @GetMapping
        public List<Usuario> getList(){
            return usuarioService.findAll();
        }

        @GetMapping("/{id}")
        public ResponseEntity<Usuario> getById(@PathVariable("id") Long id) throws Exception {
            return ResponseEntity.ok(usuarioService.getById(id).orElseThrow(() -> new Exception("Não encontrado.")));
        }

        @PutMapping
        public Usuario update(@RequestBody Usuario usuario){
            return usuarioService.update(usuario);
        }

        @DeleteMapping("/{id}")
        public ResponseEntity deleteByID(@PathVariable("id") Long id) throws Exception {
            try {
                usuarioService.delete(id);
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
            return (ResponseEntity<Usuario>) ResponseEntity.ok();
        }

}
