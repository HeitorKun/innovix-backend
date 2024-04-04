package br.com.innovix.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SaleItemsDTO {
    private Long codSaleItem;
    private String description;
    private Double price;
    private Integer quantity;
    private Long codSale;
    private Long codProd;

    // Getters e Setters

}
