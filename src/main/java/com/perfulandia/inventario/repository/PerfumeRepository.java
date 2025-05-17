package com.perfulandia.inventario.repository;

import com.perfulandia.inventario.model.Perfume;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PerfumeRepository extends JpaRepository<Perfume, Long> {
}
