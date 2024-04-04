package br.com.innovix.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
import java.util.Collection;
import java.util.Objects;

@Setter
@Getter
@Entity
@Table(name = "sale", schema = "public", catalog = "Innovix")
public class SaleEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "cod_sale", nullable = false)
    private int codSale;
    @Basic
    @Column(name = "date", nullable = false)
    private Date date;
    @Basic
    @Column(name = "type", nullable = false, length = 255)
    private String type;
    @OneToMany(mappedBy = "saleByCodSale")
    private Collection<SaleItemsEntity> saleItemsByCodSale;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SaleEntity that = (SaleEntity) o;
        return codSale == that.codSale && Objects.equals(date, that.date) && Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codSale, date, type);
    }

}
