package com.perfulandia.inventario.controller;

import com.perfulandia.inventario.model.Perfume;
import com.perfulandia.inventario.service.PerfumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/perfumes")
public class PerfumeController {

    @Autowired
    private PerfumeService perfumeService;

    @GetMapping
    public ResponseEntity<List<Perfume>> listar() {
        List<Perfume> perfumes = perfumeService.findAll();
        if (perfumes.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(perfumes);
    }

    @PostMapping
    public ResponseEntity<Perfume> guardar(@RequestBody Perfume perfume) {
        Perfume nuevo = perfumeService.save(perfume);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevo);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Perfume> buscar(@PathVariable Long id) {
        Perfume perfume = perfumeService.findById(id);
        if (perfume == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(perfume);
    }

    @PutMapping("/{id}/stock")
    public ResponseEntity<Perfume> actualizarStock(@PathVariable Long id, @RequestParam int stock) {
        Perfume actualizado = perfumeService.actualizarStock(id, stock);
        if (actualizado == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(actualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        perfumeService.delete(id);
        return ResponseEntity.noContent().build();
    }
}