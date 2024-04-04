package br.com.innovix.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class OrderItemsDTO {
    private Long codOrderItem;
    private Double discount;
    private Integer quantity;
    private Long codProd;
    private Long codOrder;

    // Getters e Setters

}
