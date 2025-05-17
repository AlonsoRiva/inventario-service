package com.perfulandia.inventario.service;

import com.perfulandia.inventario.model.Perfume;
import com.perfulandia.inventario.repository.PerfumeRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class PerfumeService {

    @Autowired
    private PerfumeRepository perfumeRepository;

    public List<Perfume> findAll() {
        return perfumeRepository.findAll();
    }

    public Perfume findById(Long id) {
        return perfumeRepository.findById(id).orElse(null);
    }

    public Perfume save(Perfume perfume) {
        return perfumeRepository.save(perfume);
    }

    public void delete(Long id) {
        perfumeRepository.deleteById(id);
    }

    public Perfume actualizarStock(Long id, int nuevoStock) {
        Perfume perfume = perfumeRepository.findById(id).orElse(null);
        if (perfume != null) {
            perfume.setStock(nuevoStock);
            return perfumeRepository.save(perfume);
        }
        return null;
    }
}
