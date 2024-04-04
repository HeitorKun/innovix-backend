package br.com.innovix.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories(basePackages = "br.com.innovix.repository")
@EnableTransactionManagement
public class JpaConfig {
    // Configurações adicionais do JPA, se necessário
}
