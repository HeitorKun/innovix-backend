package br.com.innovix.repository;

import br.com.innovix.entity.OrderItemsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemsRepository extends JpaRepository<OrderItemsEntity, Long> {
    // Consultas customizadas para OrderItems podem ser adicionadas aqui
}
