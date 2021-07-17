package com.dio.controleponto.controller;

import com.dio.controleponto.model.CategoriaUsuario;
import com.dio.controleponto.service.CategoriaUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categoriaUsuario")
public class CategoriaUsuarioController {

    @Autowired
    CategoriaUsuarioService categoriaUsuarioService;

        @PostMapping
        public CategoriaUsuario save(@RequestBody CategoriaUsuario categoriaUsuario){
            return categoriaUsuarioService.save(categoriaUsuario);
        }

        @GetMapping
        public List<CategoriaUsuario> getList(){
            return categoriaUsuarioService.findAll();
        }

        @GetMapping("/{id}")
        public ResponseEntity<CategoriaUsuario> getById(@PathVariable("id") Long id) throws Exception {
            return ResponseEntity.ok(categoriaUsuarioService.getById(id).orElseThrow(() -> new Exception("Não encontrado.")));
        }

        @PutMapping
        public CategoriaUsuario update(@RequestBody CategoriaUsuario categoriaUsuario){
            return categoriaUsuarioService.update(categoriaUsuario);
        }

        @DeleteMapping("/{id}")
        public ResponseEntity deleteByID(@PathVariable("id") Long id) throws Exception {
            try {
                categoriaUsuarioService.delete(id);
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
            return (ResponseEntity<CategoriaUsuario>) ResponseEntity.ok();
        }

}
