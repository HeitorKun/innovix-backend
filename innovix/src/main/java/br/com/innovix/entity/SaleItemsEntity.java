package br.com.innovix.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Setter
@Getter
@Entity
@Table(name = "sale_items", schema = "public", catalog = "Innovix")
public class SaleItemsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "cod_sale_item", nullable = false)
    private int codSaleItem;

    @Column(name = "description", nullable = false, length = 255)
    private String description;

    @Column(name = "price", nullable = false, precision = 0)
    private double price;

    @Column(name = "quantity", nullable = false)
    private int quantity;

    @ManyToOne
    @JoinColumn(name = "cod_sale", referencedColumnName = "cod_sale", nullable = false)
    private SaleEntity saleByCodSale;

    @ManyToOne
    @JoinColumn(name = "cod_prod", referencedColumnName = "cod_prod", nullable = false)
    private ProductEntity productByCodProd;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SaleItemsEntity that = (SaleItemsEntity) o;
        return codSaleItem == that.codSaleItem && Double.compare(price, that.price) == 0 && quantity == that.quantity && Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codSaleItem, description, price, quantity);
    }
}
