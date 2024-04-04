package br.com.innovix.repository;

import br.com.innovix.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderEntity, Long> {
    // Consultas customizadas para Order podem ser adicionadas aqui
}
