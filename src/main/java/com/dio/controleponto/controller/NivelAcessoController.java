package com.dio.controleponto.controller;

import com.dio.controleponto.model.NivelAcesso;
import com.dio.controleponto.service.NivelAcessoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/nivel-acesso")
public class NivelAcessoController {

    @Autowired
    NivelAcessoService nivelAcessoService;

        @PostMapping
        public NivelAcesso save(@RequestBody NivelAcesso nivelAcesso){
            return nivelAcessoService.save(nivelAcesso);
        }

        @GetMapping
        public List<NivelAcesso> getList(){
            return nivelAcessoService.findAll();
        }

        @GetMapping("/{id}")
        public ResponseEntity<NivelAcesso> getById(@PathVariable("id") Long id) throws Exception {
            return ResponseEntity.ok(nivelAcessoService.getById(id).orElseThrow(() -> new Exception("Não encontrado.")));
        }

        @PutMapping
        public NivelAcesso update(@RequestBody NivelAcesso nivelAcesso){
            return nivelAcessoService.update(nivelAcesso);
        }

        @DeleteMapping("/{id}")
        public ResponseEntity deleteByID(@PathVariable("id") Long id) throws Exception {
            try {
                nivelAcessoService.delete(id);
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
            return (ResponseEntity<NivelAcesso>) ResponseEntity.ok();
        }

}
