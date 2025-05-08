package com.ChinoMarket.pe.proyecto_crud.repository;

import com.ChinoMarket.pe.proyecto_crud.entities.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface StockRepository extends JpaRepository<Stock, Long> {
    // Métodos personalizados si es necesario
    List<Stock> findByProductoIdPro(Long idPro);
}
