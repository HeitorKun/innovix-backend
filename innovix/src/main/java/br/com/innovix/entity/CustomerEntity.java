package br.com.innovix.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Collection;
import java.util.Objects;

@Setter
@Getter
@Entity
@Table(name = "customer", schema = "public", catalog = "Innovix")
public class CustomerEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "cod_customer", nullable = false)
    private int codCustomer;
    @Basic
    @Column(name = "name", nullable = false, length = 255)
    private String name;
    @Basic
    @Column(name = "street", nullable = false, length = 255)
    private String street;
    @Basic
    @Column(name = "zip_code", nullable = false, length = 10)
    private String zipCode;
    @OneToMany(mappedBy = "customerByCodCustomer")
    private Collection<OrderEntity> ordersByCodCustomer;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerEntity that = (CustomerEntity) o;
        return codCustomer == that.codCustomer && Objects.equals(name, that.name) && Objects.equals(street, that.street) && Objects.equals(zipCode, that.zipCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codCustomer, name, street, zipCode);
    }

}
