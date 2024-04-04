package br.com.innovix.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
public class SaleDTO {
    private Long codSale;
    private LocalDate date;
    private String type;


}
