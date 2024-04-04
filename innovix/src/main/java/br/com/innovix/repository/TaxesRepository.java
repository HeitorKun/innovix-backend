package br.com.innovix.repository;

import br.com.innovix.entity.TaxesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaxesRepository extends JpaRepository<TaxesEntity, Long> {
    // Consultas customizadas para Taxes podem ser adicionadas aqui
}
