package br.com.innovix.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Collection;
import java.util.Objects;

@Setter
@Getter
@Entity
@Table(name = "product", schema = "public", catalog = "Innovix")
public class ProductEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "cod_prod", nullable = false)
    private int codProd;
    @Basic
    @Column(name = "image", nullable = true)
    private String image;
    @Basic
    @Column(name = "description", nullable = false, length = 255)
    private String description;
    @Basic
    @Column(name = "name", nullable = false, length = 255)
    private String name;
    @Basic
    @Column(name = "quantity", nullable = false)
    private int quantity;
    @OneToMany(mappedBy = "productByCodProd")
    private Collection<OrderItemsEntity> orderItemsByCodProd;
    @OneToMany(mappedBy = "productByCodProd")
    private Collection<SaleItemsEntity> saleItemsByCodProd;

    public ProductEntity(int codProd, String image, String description, String name, int quantity, Collection<OrderItemsEntity> orderItemsByCodProd, Collection<SaleItemsEntity> saleItemsByCodProd) {
        this.codProd = codProd;
        this.image = image;
        this.description = description;
        this.name = name;
        this.quantity = quantity;
        this.orderItemsByCodProd = orderItemsByCodProd;
        this.saleItemsByCodProd = saleItemsByCodProd;
    }

    public ProductEntity(int codProd, String image, String description, String name, int quantity) {
        this.codProd = codProd;
        this.image = image;
        this.description = description;
        this.name = name;
        this.quantity = quantity;
    }

    public ProductEntity() {

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductEntity that = (ProductEntity) o;
        return codProd == that.codProd && quantity == that.quantity && Objects.equals(image, that.image) && Objects.equals(description, that.description) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codProd, image, description, name, quantity);
    }

}
