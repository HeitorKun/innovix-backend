package br.com.innovix.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Setter
@Getter
@Entity
@Table(name = "employee", schema = "public", catalog = "Innovix")
public class EmployeeEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "cod_employee", nullable = false)
    private int codEmployee;
    @Basic
    @Column(name = "name", nullable = false, length = 255)
    private String name;
    @Basic
    @Column(name = "street", nullable = false, length = 255)
    private String street;
    @Basic
    @Column(name = "zip_code", nullable = false, length = 10)
    private String zipCode;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeEntity that = (EmployeeEntity) o;
        return codEmployee == that.codEmployee && Objects.equals(name, that.name) && Objects.equals(street, that.street) && Objects.equals(zipCode, that.zipCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codEmployee, name, street, zipCode);
    }
}
