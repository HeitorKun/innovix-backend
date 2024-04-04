package br.com.innovix.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class EmployeeDTO {
    private Long codEmployee;
    private String name;
    private String street;
    private String zipCode;

    public static EmployeeDTO createEmployeeDTO() {
        return new EmployeeDTO();
    }

}
