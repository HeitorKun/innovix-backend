package br.com.innovix.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Setter
@Getter
@Entity
@Table(name = "order_items", schema = "public", catalog = "Innovix")
public class OrderItemsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "cod_order_item", nullable = false)
    private int codOrderItem;

    @Column(name = "discount", nullable = true, precision = 0)
    private Double discount;

    @Column(name = "quantity", nullable = false)
    private int quantity;

    @ManyToOne
    @JoinColumn(name = "cod_prod", referencedColumnName = "cod_prod", nullable = false)
    private ProductEntity productByCodProd;

    @ManyToOne
    @JoinColumn(name = "cod_order", referencedColumnName = "cod_order", nullable = false)
    private OrderEntity orderByCodOrder;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderItemsEntity that = (OrderItemsEntity) o;
        return codOrderItem == that.codOrderItem && quantity == that.quantity && Objects.equals(discount, that.discount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codOrderItem, discount, quantity);
    }
}
