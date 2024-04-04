package br.com.innovix.repository;

import br.com.innovix.entity.ProductEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace.NONE;

@DataJpaTest
@AutoConfigureTestDatabase(replace = NONE)
public class ProductRepositoryTest {

    @Autowired
    private ProductRepository productRepository;

    @Test
    public void whenSaveProduct_thenRetrieveSame() {
        ProductEntity savedProduct = productRepository.save(new ProductEntity(1, "Test", "Description", "Image", 10));
        ProductEntity retrievedProduct = productRepository.findById((long) savedProduct.getCodProd()).orElse(null);

        assertThat(retrievedProduct).isNotNull();
        assertThat(retrievedProduct.getName()).isEqualTo("Image");
        // Adicione mais asserções conforme necessário
    }
}
