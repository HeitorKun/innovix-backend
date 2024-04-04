package br.com.innovix.repository;

import br.com.innovix.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<CustomerEntity, Long> {
    // Consultas customizadas para Customer podem ser adicionadas aqui
}
