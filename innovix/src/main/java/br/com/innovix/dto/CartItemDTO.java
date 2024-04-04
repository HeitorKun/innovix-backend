package br.com.innovix.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CartItemDTO {
    private Long codProd; // ID do Produto
    private String name; // Nome do Produto
    private Double price; // Preço Unitário do Produto
    private Integer quantity; // Quantidade do Produto no Carrinho
    private Double subtotal; // Preço Total para este item (price * quantity)

    public static CartItemDTO createCartItemDTO() {
        return new CartItemDTO();
    }

}
