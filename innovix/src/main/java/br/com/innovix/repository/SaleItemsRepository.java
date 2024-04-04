package br.com.innovix.repository;

import br.com.innovix.entity.SaleItemsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleItemsRepository extends JpaRepository<SaleItemsEntity, Long> {
    // Consultas customizadas para SaleItems podem ser adicionadas aqui
}
