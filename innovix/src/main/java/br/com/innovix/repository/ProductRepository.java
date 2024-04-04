package br.com.innovix.repository;

import br.com.innovix.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
    // Consultas customizadas para Product podem ser adicionadas aqui

}
