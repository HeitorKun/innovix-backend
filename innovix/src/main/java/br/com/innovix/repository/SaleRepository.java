package br.com.innovix.repository;

import br.com.innovix.entity.SaleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<SaleEntity, Long> {
    // Consultas customizadas para Sale podem ser adicionadas aqui
}
