package br.com.innovix.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Collection;
import java.util.Objects;

@Setter
@Getter
@Entity
@Table(name = "order", schema = "public", catalog = "Innovix")
public class OrderEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "cod_order", nullable = false)
    private int codOrder;

    @Basic
    @Column(name = "company_name", nullable = false, length = 255)
    private String companyName;

    @Basic
    @Column(name = "sender", nullable = false, length = 255)
    private String sender;

    @Basic
    @Column(name = "recipient", nullable = false, length = 255)
    private String recipient;

    @Basic
    @Column(name = "ship_cost", nullable = false, precision = 0)
    private double shipCost;

    @Basic
    @Column(name = "state", nullable = false, length = 50)
    private String state;

    // Mantenha apenas este mapeamento e remova o @Column para codCustomer
    @ManyToOne
    @JoinColumn(name = "cod_customer", referencedColumnName = "cod_customer", nullable = false)
    private CustomerEntity customerByCodCustomer;

    @OneToMany(mappedBy = "orderByCodOrder")
    private Collection<OrderItemsEntity> orderItemsByCodOrder;

    @OneToMany(mappedBy = "orderByCodOrder")
    private Collection<TaxesEntity> taxesByCodOrder;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderEntity that = (OrderEntity) o;
        return codOrder == that.codOrder && Double.compare(that.shipCost, shipCost) == 0 && Objects.equals(companyName, that.companyName) && Objects.equals(sender, that.sender) && Objects.equals(recipient, that.recipient) && Objects.equals(state, that.state) && Objects.equals(customerByCodCustomer, that.customerByCodCustomer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codOrder, companyName, sender, recipient, shipCost, state, customerByCodCustomer);
    }
}
