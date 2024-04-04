package br.com.innovix.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDTO {
    private Long codProd;
    private String image; // O tipo pode precisar ser ajustado dependendo de como você trata XML
    private String description;
    private String name;
    private Integer quantity;

    // Getters e Setters

}
