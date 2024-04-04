package br.com.innovix.repository;

import br.com.innovix.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {
    // Consultas customizadas para Employee podem ser adicionadas aqui
}
