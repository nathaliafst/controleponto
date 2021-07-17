package com.dio.controleponto.controller;

import com.dio.controleponto.model.Empresa;
import com.dio.controleponto.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empresa")
public class EmpresaController {

    @Autowired
    EmpresaService empresaService;

        @PostMapping
        public Empresa save(@RequestBody Empresa empresa){
            return empresaService.save(empresa);
        }

        @GetMapping
        public List<Empresa> getList(){
            return empresaService.findAll();
        }

        @GetMapping("/{id}")
        public ResponseEntity<Empresa> getById(@PathVariable("id") Long id) throws Exception {
            return ResponseEntity.ok(empresaService.getById(id).orElseThrow(() -> new Exception("Não encontrado.")));
        }

        @PutMapping
        public Empresa update(@RequestBody Empresa empresa){
            return empresaService.update(empresa);
        }

        @DeleteMapping("/{id}")
        public ResponseEntity deleteByID(@PathVariable("id") Long id) throws Exception {
            try {
                empresaService.delete(id);
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
            return (ResponseEntity<Empresa>) ResponseEntity.ok();
        }

}
