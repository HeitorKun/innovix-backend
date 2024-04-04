package br.com.innovix.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Setter
@Getter
@Entity
@Table(name = "taxes", schema = "public", catalog = "Innovix")
public class TaxesEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "cod_tax", nullable = false)
    private int codTax;

    @Basic
    @Column(name = "state", nullable = false, length = 50)
    private String state;

    @Basic
    @Column(name = "value", nullable = false, precision = 0)
    private double value;

    @Basic
    @Column(name = "description", nullable = false, length = 255)
    private String description;

    // Mantenha apenas este mapeamento e remova o @Column para codOrder
    @ManyToOne
    @JoinColumn(name = "cod_order", referencedColumnName = "cod_order", nullable = false)
    private OrderEntity orderByCodOrder;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TaxesEntity that = (TaxesEntity) o;
        return codTax == that.codTax && Double.compare(that.value, value) == 0 && Objects.equals(state, that.state) && Objects.equals(description, that.description) && Objects.equals(orderByCodOrder, that.orderByCodOrder);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codTax, state, value, description, orderByCodOrder);
    }
}
