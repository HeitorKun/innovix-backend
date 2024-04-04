package br.com.innovix.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CustomerDTO {
    // Getters e Setters
    private Long codCustomer;
    private String name;
    private String street;
    private String zipCode;

    public static CustomerDTO createCustomerDTO() {
        return new CustomerDTO();
    }

}
