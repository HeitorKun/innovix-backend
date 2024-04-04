package br.com.innovix.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TaxesDTO {
    private Long codTax;
    private String state;
    private Double value;
    private String description;
    private Long codOrder;


}
